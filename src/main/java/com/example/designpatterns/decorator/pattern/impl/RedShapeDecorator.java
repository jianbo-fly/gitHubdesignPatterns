package com.example.designpatterns.decorator.pattern.impl;

import com.example.designpatterns.decorator.pattern.Shape;

/**
 * 用途: 扩展了 ShapeDecorator 类的实体装饰类
 *
 * @author tangjianbo
 * @date  2022/12/30 15:04
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
