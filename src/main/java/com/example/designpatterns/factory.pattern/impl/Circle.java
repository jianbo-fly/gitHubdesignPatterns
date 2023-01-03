package com.example.designpatterns.factory.pattern.impl;

import com.example.designpatterns.factory.pattern.Shape;

/**
 * 用途: 实现（画圆）
 *
 * @author: tangjianbo
 * @create: 2022/12/29 14:56
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是和画圆的实现");
    }
}
