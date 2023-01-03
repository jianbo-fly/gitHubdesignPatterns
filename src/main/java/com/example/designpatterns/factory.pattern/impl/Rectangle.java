package com.example.designpatterns.factory.pattern.impl;

import com.example.designpatterns.factory.pattern.Shape;

/**
 * 用途: 画矩形
 *
 * @author: tangjianbo
 * @create: 2022/12/29 14:57
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("这是一个画矩形的方法");
    }
}
