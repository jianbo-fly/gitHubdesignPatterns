package com.example.designpatterns.proxy.pattern.api.proxy.impl;

import com.example.designpatterns.proxy.pattern.api.proxy.IProducer;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 16:53
 */
public class Producer implements IProducer {
    @Override
    public void saleProduct(float money) {
        System.out.println("卖手机，拿到钱"+money);
    }

    @Override
    public void afterService(float money) {
        System.out.println("产品售后，拿到钱"+money);
    }
}
