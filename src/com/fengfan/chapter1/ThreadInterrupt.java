package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description interrupt的使用
 * @date 2022/7/7 14:14
 */
public class ThreadInterrupt extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println(i);
        }
    }
}
