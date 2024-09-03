package com.samwei12.dp.creational.simplefactory.door;

/**
 * 封装了创建门的通用方法
 *
 * @author samwei12
 * @date 2024/9/3
 */
public class DoorFactory {
    /**
     * 创建门，简单工厂方法，只是封装了参数，屏蔽了实现细节，扩展性较差，不支持多种不同类型的门创建
     *
     * @param width  宽度
     * @param height 高度
     * @return 门
     */
    public static Door createDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}
