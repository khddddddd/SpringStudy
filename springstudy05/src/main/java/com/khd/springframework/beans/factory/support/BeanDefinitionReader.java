package com.khd.springframework.beans.factory.support;

import com.khd.springframework.beans.BeanException;
import com.khd.springframework.core.io.Resource;
import com.khd.springframework.core.io.ResourceLoader;

/**
 * @Author kehd
 * @Date 2022-1-19 15:41
 * @Version 1.0
 * @Description
 */
public interface BeanDefinitionReader
{
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeanException;

    void loadBeanDefinitions(Resource... resources) throws BeanException;

    void loadBeanDefinitions(String location) throws BeanException;

}
