package com.samwei12.dp.structural.proxy;

/**
 * @author samwei12
 * @date 2021/7/31 8:38 下午
 * @email dongxiaosen@icloud.com
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        final ClothesFactory nikeClothesFactory = new NikeClothesFactory();
        final ClothesFactory proxyClothesFactory = new ProxyClothesFactory(nikeClothesFactory);
        proxyClothesFactory.produce();
    }
}

interface ClothesFactory {
    void produce();
}

class ProxyClothesFactory implements ClothesFactory {
    // 被代理对象
    private ClothesFactory clothesFactory;

    public ProxyClothesFactory(ClothesFactory clothesFactory) {
        this.clothesFactory = clothesFactory;
    }

    @Override
    public void produce() {
        System.out.println("代理类事前准备工作");
        clothesFactory.produce();
        System.out.println("代理类时候准备工作");
    }
}

class NikeClothesFactory implements ClothesFactory {
    @Override
    public void produce() {
        System.out.println("Nike 制衣过程");
    }
}
