package com.example.designpatterns.facade.pattern.impl;

import com.example.designpatterns.facade.pattern.Shape;

/**
 * 用途: Circle
 *
 * @author tangjianbo
 * @date 2022/12/30 15:26
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }
}
