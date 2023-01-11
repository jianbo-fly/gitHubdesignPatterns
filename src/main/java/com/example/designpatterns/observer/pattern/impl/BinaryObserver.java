package com.example.designpatterns.observer.pattern.impl;

import com.example.designpatterns.observer.pattern.Observer;
import com.example.designpatterns.observer.pattern.Subject;

/**
 * 用途: 二进制
 *
 * @author tangjianbo
 * @date 2023/01/09 14:02
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
