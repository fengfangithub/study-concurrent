package com.fengfan.chapter3;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.Semaphore;

/**
 * @author fengfan
 * @description 线程间通信 https://redspider.gitbook.io/concurrent/di-yi-pian-ji-chu-pian/5
 * @date 2022/8/8 14:42
 */
public class ChapterMain3 {

    private static volatile int signal = 0;

    public static void main(String[] args) throws Exception {
        Object lock = new Object();
        //锁与同步
//        Thread a = new Thread(() -> {
//            synchronized (lock){
//                for (int i = 0; i < 10; i++){
//                    System.out.println("Thread A" + i);
//                }
//            }
//        });
//        a.start();
//        Thread.sleep(10);
//        Thread b = new Thread(() -> {
//            synchronized (lock){
//                for (int i = 0; i < 10; i++){
//                    System.out.println("Thread B" + i);
//                }
//            }
//        });
//        b.start();

        //等待/通知机制
//        Thread a = new Thread(() -> {
//            synchronized (lock) {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Thread A" + i);
//                    try {
//                        lock.notify();
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                lock.notify();
//            }
//        });
//        a.start();
//        Thread.sleep(100);
//        Thread b = new Thread(() -> {
//            synchronized (lock) {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Thread B" + i);
//                    try {
//                        lock.notify();
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        b.start();

        //信号量
//        Semaphore semaphore = new Semaphore(1);
//        Thread a = new Thread(() -> {
//            try {
//                semaphore.acquire();
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Thread A" + i);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }finally {
//                semaphore.release();
//            }
//        });
//        a.start();
//        Thread b = new Thread(() -> {
//            try {
//                semaphore.acquire();
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Thread B" + i);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }finally {
//                semaphore.release();
//            }
//        });
//        b.start();

        //volatile实现信号量
//        Thread a = new Thread(() -> {
//            while (signal < 5) {
//                if (signal % 2 == 0) {
//                    System.out.println("Thread A：" + signal);
//                    synchronized (lock) {
//                        signal++;
//                    }
//                }
//            }
//        });
//        a.start();
//        Thread.sleep(100);
//        Thread b = new Thread(() -> {
//            while (signal < 5) {
//                if (signal % 2 == 1) {
//                    System.out.println("Thread B：" + signal);
//                    synchronized (lock) {
//                        signal++;
//                    }
//                }
//            }
//        });
//        b.start();

        //管道
//        PipedReader reader = new PipedReader();
//        PipedWriter writer = new PipedWriter();
//        writer.connect(reader);
//
//        Thread a = new Thread(() -> {
//            System.out.println("这是writer");
//            try {
//                writer.write("test");
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            } finally {
//                try {
//                    writer.close();
//                } catch (IOException exception) {
//                    exception.printStackTrace();
//                }
//            }
//        });
//        a.start();
//        Thread.sleep(100);
//        Thread b = new Thread(() -> {
//            int receive = 0;
//            System.out.println("这是reader");
//            try {
//                while ((receive = reader.read()) != -1) {
//                    System.out.println((char) receive);
//                }
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }finally {
//                try {
//                    reader.close();
//                } catch (IOException exception) {
//                    exception.printStackTrace();
//                }
//            }
//        });
//        b.start();

        //join
//        Thread join = new Thread(() -> {
//            System.out.println("我是子线程，sleep一秒");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("我是子线程，执行完毕");
//        });
//        join.start();
//        join.join();
//        System.out.println("主线程结束");

        // ThreadLocal类
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread a = new Thread(() -> {
            threadLocal.set("我是线程A设置的值");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        });
        a.start();
        Thread b = new Thread(() -> {
            threadLocal.set("我是线程B设置的值");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        });
        b.start();
    }
}
