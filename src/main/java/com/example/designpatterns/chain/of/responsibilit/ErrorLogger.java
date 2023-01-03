package com.example.designpatterns.chain.of.responsibilit;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 17:41
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
