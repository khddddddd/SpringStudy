package com.khd.springframework.beans.factory.config;

/**
 * @Author kehd
 * @Date 2022-1-19 10:55
 * @Version 1.0
 * @Description
 */
public class BeanDefinition
{
    private Class baanClass;

    public BeanDefinition(Class baanClass) {
        this.baanClass = baanClass;
    }

    public Class getBaanClass() {
        return baanClass;
    }

    public void setBaanClass(Class baanClass) {
        this.baanClass = baanClass;
    }
}
