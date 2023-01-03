package com.example.designpatterns.flyweight.pattern.impl;

import com.example.designpatterns.facade.pattern.Shape;

/**
 * 用途:实现类
 *
 * @author tangjianbo
 * @date 2022/12/30 15:45
 */
public class Circle implements Shape {
    private String color;
    private Integer x;
    private Integer y;
    private Integer radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
