package com.example.designpatterns.stratage.pattern;

import com.example.designpatterns.stratage.pattern.impl.OperationAdd;
import com.example.designpatterns.stratage.pattern.impl.OperationMultiply;
import com.example.designpatterns.stratage.pattern.impl.OperationSubtract;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/11 14:51
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 5));
    }
}
