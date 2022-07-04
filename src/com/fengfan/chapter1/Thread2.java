package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 实现Runnable接口
 * @date 2022/7/1 14:39
 */
public class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + ",运行完成");
    }
}
