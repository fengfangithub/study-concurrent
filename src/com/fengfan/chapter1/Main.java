package com.fengfan.chapter1;

import java.util.concurrent.FutureTask;

/**
 * @author fengfan
 * @description 运行类
 * @date 2022/7/1 14:15
 */
public class Main {
    public static void main(String[] args) throws Exception{
//        Thread1 thread1 = new Thread1();
//        thread1.start();

//        Thread thread2 = new Thread(new Thread2());
//        thread2.start();

        Thread3 thread3 = new Thread3();
        FutureTask<String> futureTask = new FutureTask<>(thread3);
        new Thread(futureTask).start();
        System.out.println("Callable返回值：" + futureTask.get());
    }
}
