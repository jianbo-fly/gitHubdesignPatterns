package com.example.designpatterns.state.pattern;

import com.example.designpatterns.state.pattern.impl.StartState;
import com.example.designpatterns.state.pattern.impl.StopState;

/**
 * 用途: 状态模式
 *
 * @author tangjianbo
 * @date 2023/01/09 14:56
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("-------start-----");
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        System.out.println("-------stop--------");
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());



    }
}
