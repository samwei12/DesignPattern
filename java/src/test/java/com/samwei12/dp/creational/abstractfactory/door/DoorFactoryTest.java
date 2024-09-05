package com.samwei12.dp.creational.abstractfactory.door;

import com.samwei12.dp.creational.abstractfactory.door.concrete.IronDoorFactory;
import com.samwei12.dp.creational.abstractfactory.door.concrete.WoodenDoorFactory;
import org.junit.Test;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/5
 */
public class DoorFactoryTest {
    @Test
    public void test1() {
        DoorFactory doorFactory = new WoodenDoorFactory();
        Door door = doorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert = doorFactory.makeFittingExpert();
        System.out.println(door.getDescription());
        System.out.println(doorFittingExpert.getDescription());

        doorFactory = new IronDoorFactory();
        door = doorFactory.makeDoor();
        doorFittingExpert = doorFactory.makeFittingExpert();
        System.out.println(door.getDescription());
        System.out.println(doorFittingExpert.getDescription());
    }
}