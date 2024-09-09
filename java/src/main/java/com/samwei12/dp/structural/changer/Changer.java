package com.samwei12.dp.structural.changer;

/**
 * Decorator 抽象装饰类，用于对现有的变形金刚类进行扩展，其中内部组合了一个 Transform 接口，用于扩展指定的变形金刚
 *
 * @author samwei12
 * @date 2021/7/25 10:24 下午
 * @email dongxiaosen@icloud.com
 */
public class Changer implements Transform {
    /**
     * 具体的变形金刚实现类
     */
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
