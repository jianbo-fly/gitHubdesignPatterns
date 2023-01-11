package com.example.designpatterns.observer.pattern.impl;

import com.example.designpatterns.observer.pattern.Observer;
import com.example.designpatterns.observer.pattern.Subject;

/**
 * 用途: 八进制
 *
 * @author tangjianbo
 * @date 2023/01/09 14:43
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
    }
}
