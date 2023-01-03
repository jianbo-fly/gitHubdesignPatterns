package com.example.designpatterns.factory.pattern;

import com.example.designpatterns.factory.pattern.factory.ShapeFactory;

/**
 * 用途: 测试类
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:06
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 创建工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

    }
}
