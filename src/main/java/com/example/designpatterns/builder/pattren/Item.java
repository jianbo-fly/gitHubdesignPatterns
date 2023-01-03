package com.example.designpatterns.builder.pattren;

/**
 * 用途: 创建一个表示食物条目和食物包装的接口
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:15
 */
public interface Item {
    /**
     * 名字
     *
     * @return
     */
    String name();

    /**
     * 价格
     *
     * @return
     */
    float price();

    /**
     * 打包方式
     *
     * @return
     */
    Packing packing();

}
