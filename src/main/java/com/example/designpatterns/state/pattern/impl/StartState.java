package com.example.designpatterns.state.pattern.impl;

import com.example.designpatterns.state.pattern.Context;
import com.example.designpatterns.state.pattern.State;

/**
 * 用途: 行为开始 <>有多少实现了就可以替换多少if</>
 *
 * @author tangjianbo
 * @date 2023/01/09 15:14
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
