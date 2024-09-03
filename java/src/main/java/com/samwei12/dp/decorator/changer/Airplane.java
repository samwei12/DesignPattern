package com.samwei12.dp.decorator.changer;

/**
 * @author samwei12
 * @date 2021/7/25 10:27 下午
 * @email dongxiaosen@icloud.com
 */
public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("我是飞机人");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    private void fly() {
        System.out.println("我会飞");
    }
}
