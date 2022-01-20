package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * @Author kehd
 * @Date 2022-1-19 13:43
 * @Version 1.0
 * @Description
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy
{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeanException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp()
        {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor)
            return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
