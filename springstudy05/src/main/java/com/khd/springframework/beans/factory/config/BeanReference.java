package com.khd.springframework.beans.factory.config;

/**
 * @Author kehd
 * @Date 2022-1-19 14:46
 * @Version 1.0
 * @Description Bean 的引用
 */
public class BeanReference
{
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
