package com.example.designpatterns.iterator.pattern;

/**
 * 用途: 获取迭代器
 *
 * @author tangjianbo
 * @date 2023/01/07 16:24
 */

public interface Container {
    /**
     *  获取跌倒器
     * @return
     */
    Iterator getIterator();

}
