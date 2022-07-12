package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description isAlive方法使用
 * @date 2022/7/7 9:35
 */
public class ThreadIsAlive extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "isAlive：" + this.isAlive());
    }
}
