package com.example.designpatterns.factory.pattern.factory;

import com.example.designpatterns.factory.pattern.Shape;
import com.example.designpatterns.factory.pattern.impl.Circle;
import com.example.designpatterns.factory.pattern.impl.Rectangle;
import com.example.designpatterns.factory.pattern.impl.Square;

/**
 * 用途: 工厂类
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:02
 */
public class ShapeFactory {
    /**
     *  根据方法获取对象
     * @param shapeType
     * @return
     */
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
