package com.example.designpatterns.nullobject.pattern.impl;

import com.example.designpatterns.nullobject.pattern.AbstractCustomer;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/09 15:53
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
