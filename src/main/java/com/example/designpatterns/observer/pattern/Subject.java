package com.example.designpatterns.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途: subject
 *
 * @author tangjianbo
 * @date 2023/01/09 13:58
 */
public class Subject {
    private List<Observer> observerList = new ArrayList();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        observerList.forEach(e -> e.update());
    }
}
