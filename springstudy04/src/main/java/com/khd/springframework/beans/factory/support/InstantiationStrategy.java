package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author kehd
 * @Date 2022-1-19 13:42
 * @Version 1.0
 * @Description  Bean 实例化策略
 */
public interface InstantiationStrategy
{
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws
            BeanException;
}
