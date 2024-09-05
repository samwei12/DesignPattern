package com.samwei12.dp.creational.factory.interviewer.concrete;

import com.samwei12.dp.creational.factory.interviewer.HiringManager;
import com.samwei12.dp.creational.factory.interviewer.Interviewer;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/3
 */
public class DevelopmentManager extends HiringManager {
    @Override
    public Interviewer makeInterviewer() {
        return new Developer();
    }
}
