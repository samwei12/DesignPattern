package com.samwei12.dp.creational.singleton;

/**
 * @author samwei12
 * @date 2021/6/21 11:01 下午
 * @email dongxiaosen@icloud.com
 * 饿汉式，线程安全，静态初始化
 */
public class Singleton1 {
    static Singleton1 instance = new Singleton1();

    String name;

    public static Singleton1 getInstance() {
        return instance;
    }
}
