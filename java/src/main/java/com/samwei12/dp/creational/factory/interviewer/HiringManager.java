package com.samwei12.dp.creational.factory.interviewer;

/**
 * 适用于有多种不同类型的工厂，具体的工厂创建细节由子类决定
 *
 * @author samwei12
 * @date 2024/9/3
 */
public abstract class HiringManager {
    /**
     * 创建面试官对象
     *
     * @return 面试官
     */
    public abstract Interviewer makeInterviewer();

    /**
     * 面试
     */
    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}
