package com.example.designpatterns.iterator.pattern;

/**
 * 用途: 创建一个迭代器
 *
 * @author tangjianbo
 * @date 2023/01/07 16:16
 */
public interface Iterator {
    /**
     * 有下一个
     *
     * @return
     */
    boolean hasNext();

    /**
     * 下一个对象
     *
     * @return
     */
    Object next();
}
