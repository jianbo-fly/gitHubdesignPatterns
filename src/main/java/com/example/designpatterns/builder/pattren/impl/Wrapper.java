package com.example.designpatterns.builder.pattren.impl;

import com.example.designpatterns.builder.pattren.Packing;

/**
 * 用途: 包装
 *
 * @author: tangjianbo
 * @create: 2022/12/29 16:42
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
