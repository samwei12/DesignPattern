package com.samwei12.dp.creational.factory.interviewer.extend;

import com.samwei12.dp.creational.factory.interviewer.Interviewer;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/3
 */
public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("社区经理提问");
    }
}
