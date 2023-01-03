package com.example.designpatterns.facade.pattern.impl;

import com.example.designpatterns.facade.pattern.Shape;

/**
 * 用途: Square
 *
 * @author tangjianbo
 * @date 2022/12/30 15:25
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
