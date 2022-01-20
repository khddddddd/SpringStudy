package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author kehd
 * @Date 2022-1-19 13:43
 * @Version 1.0
 * @Description
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy
{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeanException {
        Class clazz = beanDefinition.getBeanClass();

        try {
            if (null != ctor) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }
            else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        }
        catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new BeanException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
