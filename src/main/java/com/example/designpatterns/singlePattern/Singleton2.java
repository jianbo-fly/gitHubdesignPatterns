package com.example.designpatterns.singlePattern;

/**
 * 用途:单例模式 （饿汉模式）
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:56
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
