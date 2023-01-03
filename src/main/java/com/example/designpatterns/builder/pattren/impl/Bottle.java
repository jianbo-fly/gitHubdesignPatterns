package com.example.designpatterns.builder.pattren.impl;

import com.example.designpatterns.builder.pattren.Packing;

/**
 * 用途: 玻璃瓶
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:43
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
