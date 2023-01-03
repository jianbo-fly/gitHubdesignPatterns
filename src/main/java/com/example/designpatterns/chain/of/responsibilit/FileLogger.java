package com.example.designpatterns.chain.of.responsibilit;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 17:42
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
