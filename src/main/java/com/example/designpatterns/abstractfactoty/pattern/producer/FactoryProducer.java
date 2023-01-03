package com.example.designpatterns.abstractfactoty.pattern.producer;

import com.example.designpatterns.abstractfactoty.pattern.abstractfactory.AbstractFactory;
import com.example.designpatterns.abstractfactoty.pattern.factory.ColorFactory;
import com.example.designpatterns.abstractfactoty.pattern.factory.ShapeFactory;

/**
 * 用途: 工厂创造器
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:32
 */
public class FactoryProducer {

    /**
     *  获取具体的工厂
     * @param factoryType
     * @return
     */
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
