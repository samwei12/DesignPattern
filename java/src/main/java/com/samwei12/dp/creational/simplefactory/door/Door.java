package com.samwei12.dp.creational.simplefactory.door;

/**
 * 封装了门的通用属性
 *
 * @author samwei12
 * @date 2024/9/3
 */
public interface Door {
    /**
     * 获取宽度
     *
     * @return
     */
    float getWidth();

    /**
     * 获取高度
     *
     * @return
     */
    float getHeight();
}
