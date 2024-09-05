package com.samwei12.dp.creational.abstractfactory.door.concrete;

import com.samwei12.dp.creational.abstractfactory.door.DoorFittingExpert;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/5
 */
public class Welder implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I can only fit iron doors";
    }
}
