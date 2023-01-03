package com.example.designpatterns.builder.pattren.impl;

import com.example.designpatterns.builder.pattren.cabstract.ColdDrink;

/**
 * 用途: 百事可乐
 *
 * @author: tangjianbo
 * @create: 2022/12/29 17:00
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.f;
    }
}
