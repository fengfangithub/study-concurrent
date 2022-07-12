package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 在沉睡中停止
 * @date 2022/7/8 14:16
 */
public class ThreadStopSleep extends Thread{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "开始");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("沉睡中终止异常块");
        }
    }
}
