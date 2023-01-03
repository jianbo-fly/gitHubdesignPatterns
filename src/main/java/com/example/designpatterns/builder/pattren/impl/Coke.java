package com.example.designpatterns.builder.pattren.impl;

import com.example.designpatterns.builder.pattren.cabstract.ColdDrink;

/**
 * 用途: 可口可乐
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:59
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.f;
    }
}
