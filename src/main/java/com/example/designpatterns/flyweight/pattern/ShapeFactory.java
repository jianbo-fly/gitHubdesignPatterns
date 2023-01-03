package com.example.designpatterns.flyweight.pattern;

import com.example.designpatterns.flyweight.pattern.impl.Circle;

import java.util.HashMap;
import java.util.Optional;

/**
 * 用途: 创建一个工厂，生成基于给定信息的实体类的对象
 *
 * @author tangjianbo
 * @date 2022/12/30 15:47
 */
public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        return Optional.ofNullable(circleMap.get(color)).orElseGet(() -> {
            Circle circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("---------" + circle.hashCode());
            return circle;
        });

    }

}
