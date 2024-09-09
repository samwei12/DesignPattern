package com.samwei12.dp.structural.changer;

/**
 * ConcreteComponent，具体实现类，提供具体功能，需要被扩展才行;且声明为 final
 * 汽车人变形金刚
 *
 * @author samwei12
 * @date 2021/7/25 10:22 下午
 * @email dongxiaosen@icloud.com
 */
public final class Car implements Transform {
    public Car() {
        System.out.println("我是汽车人");
    }

    @Override
    public void move() {
        System.out.println("汽车人移动");
    }
}
