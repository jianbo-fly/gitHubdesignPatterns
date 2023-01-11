package com.example.designpatterns.state.pattern.impl;

import com.example.designpatterns.state.pattern.Context;
import com.example.designpatterns.state.pattern.State;

/**
 * 用途: 结束行为
 *
 * @author tangjianbo
 * @date 2023/01/09 15:16
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
