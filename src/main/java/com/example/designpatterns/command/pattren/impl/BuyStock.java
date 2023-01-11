package com.example.designpatterns.command.pattren.impl;

import com.example.designpatterns.command.pattren.Order;
import com.example.designpatterns.command.pattren.Stock;

/**
 * 用途: 购买
 *
 * @author tangjianbo
 * @date 2023/01/07 15:09
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
