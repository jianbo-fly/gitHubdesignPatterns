package com.example.designpatterns.interpreter.pattern.impl;

import com.example.designpatterns.interpreter.pattern.Expression;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/07 15:47
 */
public class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
