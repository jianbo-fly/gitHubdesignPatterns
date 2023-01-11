package com.example.designpatterns.command.pattren;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途: 命令的调用者
 *
 * @author tangjianbo
 * @date 2023/01/07 15:16
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    /**
     * 添加命令
     *
     * @param order
     */
    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    /**
     *  执行命令
     */
    public void placeOrders() {
        orderList.forEach(e -> e.execute());
        orderList.clear();
    }


}
