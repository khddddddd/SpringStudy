package com.khd.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author kehd
 * @Date 2022-1-19 15:16
 * @Version 1.0
 * @Description
 */
public class DefaultResourceLoader implements ResourceLoader
{

    //工厂模式
    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        }
        else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            }
            catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }
}
