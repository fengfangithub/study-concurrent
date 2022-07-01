package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 继承Thread类实现多线程
 * @date 2022/7/1 14:12
 */
public class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + ",运行完成");
    }
}
