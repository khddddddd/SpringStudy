package com.khd.springframework.beans;

/**
 * @Author kehd
 * @Date 2022-1-19 14:32
 * @Version 1.0
 * @Description
 */
public class PropertyValue
{
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
