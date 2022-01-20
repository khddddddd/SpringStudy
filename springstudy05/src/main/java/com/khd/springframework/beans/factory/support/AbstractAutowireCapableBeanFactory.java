package com.khd.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.PropertyValue;
import com.khd.springframework.beans.PropertyValues;
import com.khd.springframework.beans.factory.config.BeanDefinition;
import com.khd.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @Author kehd
 * @Date 2022-1-19 11:17
 * @Version 1.0
 * @Description 拿BeanDefinition创建bean的实例化对象，并添加至singletonmap中
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory
{
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeanException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);

            // 给 Bean 填充属性
            applyPropertyValues(beanName, bean, beanDefinition);
        }
        catch (Exception e) {
            throw new BeanException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(
            InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    /**
     * Bean 属性填充
     */
    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                if (value instanceof BeanReference) {
                    // A 依赖 B，获取 B 的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }

                //属性填充
                BeanUtil.setFieldValue(bean, name, value);
            }
        }
        catch (Exception e) {
            throw new BeanException("Error setting property values：" + beanName);
        }
    }
}
