package com.samwei12.dp.singleton;

/**
 * @author samwei12
 * @date 2021/6/21 11:01 下午
 * @email dongxiaosen@icloud.com
 * 懒汉式
 */
public class Singleton2 {
    static Singleton2 instance = null;

    String name;

    // 线程不安全
//    public static Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    // 方式一： 直接同步，效率低，每次查询的时候都是单线程
//    public synchronized static Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    // 方式二：双重判空，第一层不需要加锁，第二层真正创建的时候加锁，仅第一次第一层多个线程进入时候才会触发第二层的锁，其余时候都是直接返回，效率高
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
