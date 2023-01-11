package com.example.designpatterns.nullobject.pattern;

import com.example.designpatterns.nullobject.pattern.impl.NullCustomer;
import com.example.designpatterns.nullobject.pattern.impl.RealCustomer;

/**
 * 用途: 消费工厂模式
 *
 * @author tangjianbo
 * @date 2023/01/09 15:57
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
