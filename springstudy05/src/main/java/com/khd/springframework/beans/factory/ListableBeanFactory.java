package com.khd.springframework.beans.factory;

import com.khd.springframework.beans.BeanException;

import java.util.Map;

/**
 * @Author kehd
 * @Date 2022-1-19 15:33
 * @Version 1.0
 * @Description
 */
public interface ListableBeanFactory extends BeanFactory
{
    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeanException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
