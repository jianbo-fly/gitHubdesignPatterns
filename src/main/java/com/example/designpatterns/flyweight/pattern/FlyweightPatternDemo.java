package com.example.designpatterns.flyweight.pattern;

import com.example.designpatterns.flyweight.pattern.impl.Circle;

import java.util.stream.Stream;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 15:59
 */
public class FlyweightPatternDemo {

    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
            System.out.println(circle.hashCode());
        }
    }


    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
