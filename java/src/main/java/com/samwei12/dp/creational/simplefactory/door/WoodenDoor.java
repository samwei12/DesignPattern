package com.samwei12.dp.creational.simplefactory.door;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/3
 */
public class WoodenDoor implements Door {
    /**
     * 宽度
     */
    private final float width;
    /**
     * 高度
     */
    private final float height;

    public WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }
}
