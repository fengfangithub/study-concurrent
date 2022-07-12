package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description yield方法使用
 * @date 2022/7/7 10:55
 */
public class ThreadYield extends Thread {

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
//            Thread.yield();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - startTime));
    }
}
