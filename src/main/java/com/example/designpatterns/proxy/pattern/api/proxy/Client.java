package com.example.designpatterns.proxy.pattern.api.proxy;

import com.example.designpatterns.proxy.pattern.api.proxy.impl.Producer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2022/12/30 16:58
 */
public class Client {
    public static void main(String[] args) {
        final Producer producer = new Producer();
        /**
         * 基于接口的动态代理
         *   newProxyInstance方法的参数
         *      classLoader:类加载器
         *          它是用于加载代理对象字节码的。
         *      class[]：字节码数组
         *           它是用于让代理对象和被代理对象有相同方法
         *      InvocationHandler：提供增强的代码
         *
         */

        IProducer iProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                Float money = (Float) objects[0];
                objects[0] = money * 3;
                System.out.println();
                return method.invoke(producer, objects);
            }
        });
        iProducer.saleProduct(89);
    }
}
