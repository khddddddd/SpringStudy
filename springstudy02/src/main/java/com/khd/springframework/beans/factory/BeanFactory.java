package com.khd.springframework.beans.factory;

import com.khd.springframework.beans.BeanException;

/**
 * @Author kehd
 * @Date 2022-1-19 10:53
 * @Version 1.0
 * @Description
 */
public interface BeanFactory
{
    Object getBean(String beanName) throws BeanException;
}
