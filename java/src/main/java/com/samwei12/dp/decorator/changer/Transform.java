package com.samwei12.dp.decorator.changer;

/**
 * @author samwei12
 * @date 2021/7/25 10:21 下午
 * @email dongxiaosen@icloud.com
 * 变形金刚在变形前是一辆汽车，它可以在陆地上移动。当它变成机器人之后除了能够在陆 地上移动之外，还可以说话；如果需要，它还可以变成飞机，除了在陆地上移动还可以在天空中飞翔。
 * 这里可能 SDK 中只提供了汽车变形金刚，但我们需要扩展说话、飞机等功能
 * 变形金刚基础接口
 */
public interface Transform {
    /**
     * 移动方法，不管变形金刚怎么改，都是可移动的
     */
    void move();
}
