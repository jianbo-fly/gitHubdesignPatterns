package com.example.designpatterns.observer.pattern;

/**
 * 用途:  创建一个观察者
 *
 * @author tangjianbo
 * @date 2023/01/09 14:00
 */
public abstract class Observer {
    protected Subject subject;

   public abstract void update();

}
