package com.example.designpatterns.nullobject.pattern.impl;

import com.example.designpatterns.nullobject.pattern.AbstractCustomer;
import org.springframework.util.StringUtils;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/09 15:51
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
