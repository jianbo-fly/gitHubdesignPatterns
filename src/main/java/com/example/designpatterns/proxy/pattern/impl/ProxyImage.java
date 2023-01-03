package com.example.designpatterns.proxy.pattern.impl;

import com.example.designpatterns.proxy.pattern.Image;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 16:33
 */
public class ProxyImage implements Image {


    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;

    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
