package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 守护线程
 * @date 2022/7/12 16:48
 */
public class ThreadDeamon extends Thread{

    @Override
    public void run() {
        int i = 0;
        while(true){
            i++;
            System.out.println("i=" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
