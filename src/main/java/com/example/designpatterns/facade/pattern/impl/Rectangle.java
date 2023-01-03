package com.example.designpatterns.facade.pattern.impl;

import com.example.designpatterns.facade.pattern.Shape;

/**
 * 用途: Rectangle
 *
 * @author tangjianbo
 * @date 2022/12/30 15:24
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Rectangle");
    }
}
