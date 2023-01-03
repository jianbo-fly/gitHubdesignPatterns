package com.example.designpatterns.decorator.pattern;

import com.example.designpatterns.decorator.pattern.impl.Circle;
import com.example.designpatterns.decorator.pattern.impl.Rectangle;
import com.example.designpatterns.decorator.pattern.impl.RedShapeDecorator;
import com.example.designpatterns.decorator.pattern.impl.ShapeDecorator;

/**
 * 用途: 测试类
 *
 * @author: tangjianbo
 * @create: 2022/12/30 15:10
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
