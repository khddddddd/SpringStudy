package com.khd.springframework.beans.factory.support;

import com.khd.springframework.core.io.DefaultResourceLoader;
import com.khd.springframework.core.io.ResourceLoader;

/**
 * @Author kehd
 * @Date 2022-1-19 15:40
 * @Version 1.0
 * @Description
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader
{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
