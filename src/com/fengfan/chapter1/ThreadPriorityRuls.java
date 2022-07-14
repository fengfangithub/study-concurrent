package com.fengfan.chapter1;

import java.util.Random;

/**
 * @author fengfan
 * @description 优先级越高越优先执行
 * @date 2022/7/12 15:39
 */
public class ThreadPriorityRuls extends Thread{

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int a = 0;
        for(int i = 0; i < 100; i++){
            for (int j = 0; j < 10000; j ++) {
                Random random = new Random();
                a+= random.nextInt();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "执行结束用时：" + (end - begin));
    }
}
