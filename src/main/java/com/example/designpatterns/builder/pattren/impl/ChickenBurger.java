package com.example.designpatterns.builder.pattren.impl;

import com.example.designpatterns.builder.pattren.cabstract.Burger;

/**
 * 用途: 鸡肉汉堡
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:57
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.f;
    }
}
