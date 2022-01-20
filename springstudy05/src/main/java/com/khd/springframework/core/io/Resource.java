package com.khd.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author kehd
 * @Date 2022-1-19 15:12
 * @Version 1.0
 * @Description
 */
public interface Resource
{
    InputStream getInputStream() throws IOException;
}
