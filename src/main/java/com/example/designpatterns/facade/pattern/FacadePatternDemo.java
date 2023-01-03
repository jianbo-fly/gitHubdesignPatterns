package com.example.designpatterns.facade.pattern;

/**
 * 用途: 测试类
 *
 * @author tangjianbo
 * @date 2022/12/30 15:29
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
