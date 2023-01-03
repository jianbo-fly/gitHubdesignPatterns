package com.example.designpatterns.decorator.pattern.impl;

import com.example.designpatterns.decorator.pattern.Shape;

/**
 * 用途: 抽象装饰类
 *
 * @author: tangjianbo
 * @create: 2022/12/30 15:02
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
