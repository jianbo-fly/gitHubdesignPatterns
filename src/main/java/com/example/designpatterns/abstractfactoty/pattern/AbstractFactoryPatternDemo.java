package com.example.designpatterns.abstractfactoty.pattern;

import com.example.designpatterns.abstractfactoty.pattern.abstractfactory.AbstractFactory;
import com.example.designpatterns.abstractfactoty.pattern.producer.FactoryProducer;
import com.example.designpatterns.factory.pattern.Shape;

/**
 * 用途: 测试
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:36
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
        // 获取形状为CIRCLE的对象
        Shape circle = shape.getShape("CIRCLE");
        // 获取CIRCLE的动作
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactory("COLOR");
        Color red = color.getColor("RED");
        red.fill();



    }
}
