package com.khd.springframework.beans.factory.config;

/**
 * @Author kehd
 * @Date 2022-1-19 10:57
 * @Version 1.0
 * @Description
 */
public interface SingletonBeanRegisty
{
    Object getSingleton(String beanName);
}
