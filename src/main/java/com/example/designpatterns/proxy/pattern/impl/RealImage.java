package com.example.designpatterns.proxy.pattern.impl;

import com.example.designpatterns.proxy.pattern.Image;

/**
 * 用途: 真实的实现
 *
 * @author tangjianbo
 * @date 2022/12/30 16:31
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
