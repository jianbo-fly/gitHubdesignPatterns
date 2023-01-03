package com.example.designpatterns.abstractfactoty.pattern.impl;

import com.example.designpatterns.abstractfactoty.pattern.Color;

/**
 * 用途: 这是蓝色
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:21
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("this is blue");
    }
}
