package com.khd.springframework.beans.factory;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.khd.springframework.beans.factory.config.BeanDefinition;
import com.khd.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author kehd
 * @Date 2022-1-19 15:39
 * @Version 1.0
 * @Description
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory,
        ConfigurableBeanFactory
{
    BeanDefinition getBeanDefinition(String beanName) throws BeanException;
}
