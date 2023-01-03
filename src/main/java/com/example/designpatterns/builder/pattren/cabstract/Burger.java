package com.example.designpatterns.builder.pattren.cabstract;

import com.example.designpatterns.builder.pattren.Item;
import com.example.designpatterns.builder.pattren.Packing;
import com.example.designpatterns.builder.pattren.impl.Wrapper;

/**
 * 用途: 汉堡
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:47
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 价格
     * @return
     */
    @Override
    public abstract float price();

}
