package com.example.designpatterns.proxy.pattern.api.proxy;

/**
 * 用途: 对手机商要求的接口
 *
 * @author tangjianbo
 * @date 2022/12/30 16:40
 */

public interface IProducer {
    /**
     * 卖手机
     *
     * @param money
     */
    void saleProduct(float money);

    /**
     *
     * @param money
     */
    void afterService(float money);

}
