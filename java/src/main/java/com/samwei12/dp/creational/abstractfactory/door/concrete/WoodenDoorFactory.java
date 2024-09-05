package com.samwei12.dp.creational.abstractfactory.door.concrete;

import com.samwei12.dp.creational.abstractfactory.door.Door;
import com.samwei12.dp.creational.abstractfactory.door.DoorFactory;
import com.samwei12.dp.creational.abstractfactory.door.DoorFittingExpert;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/5
 */
public class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
