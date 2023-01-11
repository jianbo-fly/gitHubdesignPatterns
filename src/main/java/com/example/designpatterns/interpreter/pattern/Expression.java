package com.example.designpatterns.interpreter.pattern;

/**
 * 用途: 一个表达式接口
 *
 * @author tangjianbo
 * @date 2023/01/07 15:46
 */
public interface Expression {
    /**
     *   解释
     * @param context
     * @return
     */
    boolean interpret(String context);
}
