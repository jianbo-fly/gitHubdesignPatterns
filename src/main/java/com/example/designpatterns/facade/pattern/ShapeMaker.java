package com.example.designpatterns.facade.pattern;

import com.example.designpatterns.facade.pattern.impl.Circle;
import com.example.designpatterns.facade.pattern.impl.Rectangle;
import com.example.designpatterns.facade.pattern.impl.Square;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 15:26
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
