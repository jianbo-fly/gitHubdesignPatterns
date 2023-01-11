package com.example.designpatterns.mediator.pattren;

/**
 * 用途: 测试类
 *
 * @author tangjianbo
 * @date 2023/01/09 11:02
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
