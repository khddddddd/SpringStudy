package com.khd.springframework.beans;

import com.khd.springframework.beans.PropertyValue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kehd
 * @Date 2022-1-19 14:35
 * @Version 1.0
 * @Description
 */
public class PropertyValues
{
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
