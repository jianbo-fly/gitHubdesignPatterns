package com.example.designpatterns.abstractfactoty.pattern.factory;

import com.example.designpatterns.abstractfactoty.pattern.Color;
import com.example.designpatterns.abstractfactoty.pattern.abstractfactory.AbstractFactory;
import com.example.designpatterns.factory.pattern.Shape;
import com.example.designpatterns.factory.pattern.impl.Circle;
import com.example.designpatterns.factory.pattern.impl.Rectangle;
import com.example.designpatterns.factory.pattern.impl.Square;

/**
 * 用途: 形状的工厂实现
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:27
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
