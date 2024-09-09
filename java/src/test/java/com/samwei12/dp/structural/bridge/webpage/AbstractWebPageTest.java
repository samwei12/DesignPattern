package com.samwei12.dp.structural.bridge.webpage;

import com.samwei12.dp.structural.bridge.webpage.concrete.DarkTheme;
import com.samwei12.dp.structural.bridge.webpage.concrete.HomePage;
import com.samwei12.dp.structural.bridge.webpage.concrete.LightTheme;
import org.junit.Test;

/**
 * @author samwei12
 * @date 2024/9/9
 */
public class AbstractWebPageTest {
    @Test
    public void test1() {
        AbstractWebPage homePage = new HomePage(new DarkTheme());
        System.out.println(homePage.getContent());

        homePage = new HomePage(new LightTheme());
        System.out.println(homePage.getContent());
    }
}