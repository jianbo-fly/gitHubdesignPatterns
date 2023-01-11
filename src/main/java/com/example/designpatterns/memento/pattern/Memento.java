package com.example.designpatterns.memento.pattern;

/**
 * 用途:  创建一个
 *
 * @author tangjianbo
 * @date 2023/01/09 11:06
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }
}
