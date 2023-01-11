package com.example.designpatterns.state.pattern;

/**
 * 用途: 状态的上下文
 *
 * @author tangjianbo
 * @date 2023/01/09 15:11
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
