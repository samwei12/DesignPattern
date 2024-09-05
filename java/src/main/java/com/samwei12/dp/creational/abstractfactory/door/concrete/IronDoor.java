package com.samwei12.dp.creational.abstractfactory.door.concrete;

import com.samwei12.dp.creational.abstractfactory.door.Door;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/5
 */
public class IronDoor implements Door {
    @Override
    public String getDescription() {
        return "I'm an iron door";
    }
}
