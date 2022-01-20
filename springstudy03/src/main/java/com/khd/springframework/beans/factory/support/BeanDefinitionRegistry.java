package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author kehd
 * @Date 2022-1-19 10:59
 * @Version 1.0
 * @Description
 */
public interface BeanDefinitionRegistry
{
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
