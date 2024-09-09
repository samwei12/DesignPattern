package com.samwei12.dp.structural.bridge.webpage;

/**
 * @author samwei12
 * @date 2024/9/9
 */
public abstract class AbstractWebPage {
    protected Theme theme;

    public AbstractWebPage(Theme theme) {
        this.theme = theme;
    }

    abstract public String getContent();
}
