package com.example.designpatterns.builder.pattren.cabstract;

import com.example.designpatterns.builder.pattren.Item;
import com.example.designpatterns.builder.pattren.Packing;
import com.example.designpatterns.builder.pattren.impl.Bottle;

/**
 * 用途: 冷饮
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:50
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
