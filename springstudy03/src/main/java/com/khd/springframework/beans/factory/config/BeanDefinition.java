package com.khd.springframework.beans.factory.config;

/**
 * @Author kehd
 * @Date 2022-1-19 10:55
 * @Version 1.0
 * @Description
 */
public class BeanDefinition
{
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
