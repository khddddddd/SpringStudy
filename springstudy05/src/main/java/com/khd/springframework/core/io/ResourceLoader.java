package com.khd.springframework.core.io;

/**
 * @Author kehd
 * @Date 2022-1-19 15:12
 * @Version 1.0
 * @Description
 */
public interface ResourceLoader
{
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
