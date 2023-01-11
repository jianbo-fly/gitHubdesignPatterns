package com.example.designpatterns.memento.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/09 11:26
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
