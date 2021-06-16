package com.samwei12.dp.Template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author samwei12
 * @date 2021/6/16 10:37 下午
 * @email dongxiaosen@icloud.com
 */
public class AbstractTemplateTest {

    @Test
    public void test1() {
        new Subclass1().calculate();
    }

    @Test
    public void test2() {
        new Subclass2().calculate();
    }
}