package com.samwei12.dp.structural.bridge.webpage.concrete;

import com.samwei12.dp.structural.bridge.webpage.AbstractWebPage;
import com.samwei12.dp.structural.bridge.webpage.Theme;

/**
 * @author samwei12
 * @date 2024/9/9
 */
public class AboutPage extends AbstractWebPage {
    public AboutPage(Theme theme) {
        super(theme);
    }

    @Override
    public String getContent() {
        return "About Page in " + theme.getTheme();
    }
}
