package com.samwei12.dp.creational.builder.burger;

import org.junit.Test;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/5
 */
public class BurgerTest {
    @Test
    public void name() {
        Burger burger = new Burger.BurgerBuilder(15)
            .addBacon()
            .build();
        System.out.println(burger);
    }
}