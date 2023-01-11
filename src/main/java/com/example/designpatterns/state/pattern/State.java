package com.example.designpatterns.state.pattern;

/**
 * 用途: 定义一个状态接口
 *
 * @author tangjianbo
 * @date 2023/01/09 14:56
 */
public interface State {
    /**
     * 执行行为
     * @param context
     */
    void doAction(Context context);
}
