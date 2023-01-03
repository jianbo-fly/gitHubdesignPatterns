package com.example.designpatterns.abstractfactoty.pattern.factory;

import com.example.designpatterns.abstractfactoty.pattern.Color;
import com.example.designpatterns.abstractfactoty.pattern.abstractfactory.AbstractFactory;
import com.example.designpatterns.abstractfactoty.pattern.impl.Blue;
import com.example.designpatterns.abstractfactoty.pattern.impl.Green;
import com.example.designpatterns.abstractfactoty.pattern.impl.Red;
import com.example.designpatterns.factory.pattern.Shape;


/**
 * 用途: 获取颜色的工厂实现
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:29
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color) {
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
            case "GREEN":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
