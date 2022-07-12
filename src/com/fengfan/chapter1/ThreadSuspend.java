package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 线程暂停
 * @date 2022/7/11 9:24
 */
public class ThreadSuspend extends Thread{

    private int a = 0;

    @Override
    public void run() {
        while(true){
            a++;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
