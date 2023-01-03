package com.example.designpatterns.proxy.pattern;

import com.example.designpatterns.proxy.pattern.impl.ProxyImage;

/**
 * 用途: 测试类
 *
 * @author tangjianbo
 * @date 2022/12/30 16:37
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
