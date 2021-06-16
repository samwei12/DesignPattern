package com.samwei12.dp.Template;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

/**
 * @author samwei12
 * @date 2021/6/16 10:32 下午
 * @email dongxiaosen@icloud.com
 */
@Slf4j
public abstract class AbstractTemplate {
    public void calculate() {
        final long start = Instant.now().toEpochMilli();
        code();
        final long end = Instant.now().toEpochMilli();
        log.info("花费的时间为 {}", end - start);
    }

    abstract void code();
}

class Subclass1 extends AbstractTemplate {
    @Override
    void code() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Subclass2 extends AbstractTemplate {
    @Override
    void code() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
