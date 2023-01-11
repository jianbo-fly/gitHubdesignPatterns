package com.example.designpatterns.command.pattren;

/**
 * 用途: 一个请求类（购买或者是销售）
 *
 * @author tangjianbo
 * @date 2023/01/07 15:09
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    /**
     * 购买
     */
    public void buy() {
        System.out.println("Stock [ Name: " + name + ", " +
                "Quantity: " + quantity + " ] bought");
    }

    /**
     *  销售
     */
    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }


}
