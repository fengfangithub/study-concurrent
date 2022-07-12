package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description stop方法停止线程
 * @date 2022/7/8 14:29
 */
public class ThreadStopFun extends Thread{
    @Override
    public void run() {
        try {
            int i = 0;
            while (true){
                i++;
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
