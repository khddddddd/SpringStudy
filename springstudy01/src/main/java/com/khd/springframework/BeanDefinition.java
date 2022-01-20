package com.khd.springframework;

/**
 * @Author kehd
 * @Date 2022-1-13 10:47
 * @Version 1.0
 * @Description
 */
public class BeanDefinition
{
    private Object bean;

    public BeanDefinition(Object object) {
        this.bean = object;
    }

    public Object getBean() {
        return bean;
    }
}
