package com.example.designpatterns.observer.pattern.impl;

import com.example.designpatterns.observer.pattern.Observer;
import com.example.designpatterns.observer.pattern.Subject;

/**
 * 用途: 十六进制
 *
 * @author tangjianbo
 * @date 2023/01/09 14:47
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }

}
