package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.factory.BeanFactory;
import com.khd.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author kehd
 * @Date 2022-1-19 11:01
 * @Version 1.0
 * @Description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory
{
    @Override
    public Object getBean(String beanName) throws BeanException {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException;
}
