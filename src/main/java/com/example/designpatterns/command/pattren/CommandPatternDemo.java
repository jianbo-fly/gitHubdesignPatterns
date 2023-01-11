package com.example.designpatterns.command.pattren;

import com.example.designpatterns.command.pattren.impl.BuyStock;
import com.example.designpatterns.command.pattren.impl.SellStock;

/**
 * 用途: 测试  （命令模式-行为型设计模式）
 *
 * @author tangjianbo
 * @date 2023/01/07 15:20
 */
public class CommandPatternDemo {
    public static void main(String[] args) {

        BuyStock buyStock = new BuyStock(new Stock());
        SellStock sellStock = new SellStock(new Stock());

        Broker broker = new Broker();
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);

        broker.placeOrders();
    }
}
