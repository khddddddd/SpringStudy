package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.factory.config.SingletonBeanRegisty;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author kehd
 * @Date 2022-1-19 11:05
 * @Version 1.0
 * @Description
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegisty
{
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
