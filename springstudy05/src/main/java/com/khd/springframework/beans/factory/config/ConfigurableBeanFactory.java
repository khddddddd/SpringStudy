package com.khd.springframework.beans.factory.config;

import com.khd.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author kehd
 * @Date 2022-1-19 15:37
 * @Version 1.0
 * @Description
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegisty
{
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
