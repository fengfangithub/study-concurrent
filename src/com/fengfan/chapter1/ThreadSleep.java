package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description sleep方法使用
 * @date 2022/7/7 10:24
 */
public class ThreadSleep extends Thread{

    @Override
    public void run() {
        System.out.println("threadNmae：" + currentThread().getName() + "开始：" + System.currentTimeMillis());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("threadNmae：" + currentThread().getName() + "结束：" + System.currentTimeMillis());
    }
}
