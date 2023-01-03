package com.example.designpatterns.singlePattern;

/**
 * 用途: 单例模式 (dcl 双检锁)
 *
 * @author: tangjianbo
 * @create: 2022/12/29 15:43
 */
public class Singleton1 {
    private static volatile Singleton1 singlePattern = null;

    /**
     * 私有化构造函数
     */
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (singlePattern == null) {
            synchronized (Singleton1.class) {
                if (singlePattern == null) {
                    singlePattern =  new Singleton1();
                }
            }
        }
        return singlePattern;
    }
}
