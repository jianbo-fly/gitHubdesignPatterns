package com.example.designpatterns.decorator.pattern.impl;

import com.example.designpatterns.decorator.pattern.Shape;

/**
 * 用途: 圆形
 *
 * @author: tangjianbo
 * @create: 2022/12/30 15:01
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }
}
