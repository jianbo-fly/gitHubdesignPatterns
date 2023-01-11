package com.example.designpatterns.stratage.pattern.impl;

import com.example.designpatterns.stratage.pattern.Strategy;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/11 14:47
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
