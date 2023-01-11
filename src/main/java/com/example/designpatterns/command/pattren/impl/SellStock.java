package com.example.designpatterns.command.pattren.impl;

import com.example.designpatterns.command.pattren.Order;
import com.example.designpatterns.command.pattren.Stock;

/**
 * 用途: 售出
 *
 * @author tangjianbo
 * @date 2023/01/07 15:15
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
