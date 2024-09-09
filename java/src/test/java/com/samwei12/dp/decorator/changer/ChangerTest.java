package com.samwei12.dp.decorator.changer;

import com.samwei12.dp.structural.changer.Airplane;
import com.samwei12.dp.structural.changer.Car;
import com.samwei12.dp.structural.changer.Changer;
import com.samwei12.dp.structural.changer.Transform;
import org.junit.Test;

/**
 * @author samwei12
 * @date 2021/7/25 10:28 下午
 * @email dongxiaosen@icloud.com
 */
public class ChangerTest {

    @Test
    public void move() {
        Transform car = new Car();
        car.move();

        final Changer airplane = new Airplane(car);
        airplane.move();
    }
}