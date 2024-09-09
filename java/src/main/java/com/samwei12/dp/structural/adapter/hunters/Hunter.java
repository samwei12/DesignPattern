package com.samwei12.dp.structural.adapter.hunters;

import com.samwei12.dp.structural.adapter.hunters.concrete.AfricanLion;

/**
 * @author samwei12
 * @date 2024/9/9
 */
public class Hunter {
    /**
     * 狩猎
     */
    void hunt(Lion lion) {
        lion.roar();
    }

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        hunter.hunt(new AfricanLion());
        // 此时如果我们有一个 Dog 猎手，我们无法直接调用他的 hunt 方法，就需要一个适配器
    }
}
