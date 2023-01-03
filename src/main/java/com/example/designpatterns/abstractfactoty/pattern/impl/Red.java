package com.example.designpatterns.abstractfactoty.pattern.impl;

import com.example.designpatterns.abstractfactoty.pattern.Color;

/**
 * 用途: 获取红色
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:21
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("this is Red");
    }
}
