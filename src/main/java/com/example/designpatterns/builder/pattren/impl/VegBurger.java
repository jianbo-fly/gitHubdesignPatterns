package com.example.designpatterns.builder.pattren.impl;

import com.example.designpatterns.builder.pattren.cabstract.Burger;

/**
 * 用途: 素食汉堡
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:56
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
