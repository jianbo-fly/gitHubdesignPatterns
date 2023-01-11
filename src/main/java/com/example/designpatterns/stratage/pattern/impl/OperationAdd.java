package com.example.designpatterns.stratage.pattern.impl;

import com.example.designpatterns.stratage.pattern.Strategy;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/11 14:46
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
