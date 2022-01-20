package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author kehd
 * @Date 2022-1-19 11:17
 * @Version 1.0
 * @Description 拿BeanDefinition创建bean的实例化对象，并添加至singletonmap中
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory
{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException {
        Object bean = null;
        try {
            bean = beanDefinition.getBaanClass().newInstance();
        }
        catch (IllegalAccessException | InstantiationException e) {
            throw new BeanException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);

        return bean;
    }
}
