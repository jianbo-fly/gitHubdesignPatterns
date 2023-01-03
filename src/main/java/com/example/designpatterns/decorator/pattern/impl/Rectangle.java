package com.example.designpatterns.decorator.pattern.impl;

import com.example.designpatterns.decorator.pattern.Shape;

/**
 * 用途: 矩形
 *
 * @author: tangjianbo
 * @create: 2022/12/30 15:00
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
