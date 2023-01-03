package com.example.designpatterns.chain.of.responsibilit;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 17:35
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
