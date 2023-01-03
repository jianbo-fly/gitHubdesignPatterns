package com.example.designpatterns.abstractfactoty.pattern.impl;

import com.example.designpatterns.abstractfactoty.pattern.Color;

/**
 * 用途: 绿色
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:22
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("this is Green");
    }
}
