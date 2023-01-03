package com.example.designpatterns.factory.pattern.impl;

import com.example.designpatterns.factory.pattern.Shape;

/**
 * 用途: 画正方形
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:00
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是一个画正方形的操作");
    }
}
