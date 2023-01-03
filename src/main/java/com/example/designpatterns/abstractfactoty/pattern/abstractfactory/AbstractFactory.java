package com.example.designpatterns.abstractfactoty.pattern.abstractfactory;

import com.example.designpatterns.abstractfactoty.pattern.Color;
import com.example.designpatterns.factory.pattern.Shape;

/**
 * 用途: 抽象工厂
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:24
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);
    /**
     * 获取形状
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
