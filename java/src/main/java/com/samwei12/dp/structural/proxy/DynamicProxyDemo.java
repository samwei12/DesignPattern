package com.samwei12.dp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author samwei12
 * @date 2021/7/31 8:42 下午
 * @email dongxiaosen@icloud.com
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        final NikeClothesFactory nikeClothesFactory = new NikeClothesFactory();
        final ClothesFactory proxyInstance = (ClothesFactory)ProxyFactory.getProxyInstance(nikeClothesFactory);
        proxyInstance.produce();
    }
}

class ProxyFactory {
    public static Object getProxyInstance(Object target) {
        final MyInvocationHandler myInvocationHandler = new MyInvocationHandler(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
            myInvocationHandler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类执行事前准备");
        final Object invoke = method.invoke(target, args);
        System.out.println("代理类执行事后准备");
        return invoke;
    }
}
