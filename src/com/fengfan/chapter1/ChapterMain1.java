package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 运行类
 * @date 2022/7/1 14:15
 */
public class ChapterMain1 {
    public static void main(String[] args) throws Exception{
//        Thread1 thread1 = new Thread1();
//        thread1.start();

//        Thread thread2 = new Thread(new Thread2());
//        thread2.start();

//        Thread3 thread3 = new Thread3();
//        FutureTask<String> futureTask = new FutureTask<>(thread3);
//        new Thread(futureTask).start();
//        System.out.println("Callable返回值：" + futureTask.get());

//        System.out.println(Thread.currentThread().getName());

//        ThreadIsAlive threadIsAlive = new ThreadIsAlive();
//        threadIsAlive.start();

//        ThreadSleep threadSleep = new ThreadSleep();
//        threadSleep.start();

//        Thread thread = Thread.currentThread();
//        System.out.println(thread.getName() + "：" + thread.getId());

//        ThreadYield threadYield = new ThreadYield();
//        threadYield.start();

//        ThreadInterrupt threadInterrupt = new ThreadInterrupt();
//        threadInterrupt.start();
//        threadInterrupt.interrupt();
//        System.out.println("当前线程是否中断：" + ThreadInterrupt.interrupted());
//        System.out.println("ThreadInterrupt实例是否中断：" + threadInterrupt.isInterrupted());

//        ThreadStopExc threadStopExc = new ThreadStopExc();
//        threadStopExc.start();
//        Thread.sleep(1);
//        threadStopExc.interrupt();

//        ThreadStopSleep threadStopSleep = new ThreadStopSleep();
//        threadStopSleep.start();
//        Thread.sleep(100);
//        threadStopSleep.interrupt();

//        ThreadStopFun threadStopFun = new ThreadStopFun();
//        threadStopFun.start();
//        Thread.sleep(200);
//        threadStopFun.stop();

//        ThreadSuspend threadSuspend = new ThreadSuspend();
//        threadSuspend.start();
//        Thread.sleep(2);
//        threadSuspend.suspend();
//        System.out.println("暂停时间：" + System.currentTimeMillis() + "，A：" + threadSuspend.getA());
//        Thread.sleep(5000);
//        threadSuspend.resume();
//        System.out.println("暂停结束：" + System.currentTimeMillis() + "，A：" + threadSuspend.getA());

//        ThreadSuspendDis threadSuspendDis = new ThreadSuspendDis();
//        SynObj synObj = new SynObj();
//        threadSuspendDis.setSynObj(synObj);
//        Thread a = new Thread(threadSuspendDis);
//        Thread b = new Thread(threadSuspendDis);
//        a.setName("A");
//        a.start();
//        Thread.sleep(1000);
//        b.setName("B");
//        b.start();

//        SynObj synObj = new SynObj();
//        ThreadSuspendNotSyn threadSuspendNotSyn = new ThreadSuspendNotSyn();
//        threadSuspendNotSyn.setSynObj(synObj);
//        Thread a = new Thread(threadSuspendNotSyn);
//        a.setName("A");
//        a.start();
//        Thread b = new Thread(threadSuspendNotSyn);
//        b.setName("B");
//        b.start();

//        ThreadPriorityExtends threadPriorityExtends = new ThreadPriorityExtends();
//        threadPriorityExtends.setName("A");
//        threadPriorityExtends.setPriority(Thread.MAX_PRIORITY);
//        threadPriorityExtends.start();

//        for(int i = 0; i < 3; i++){
//            ThreadPriorityRuls b = new ThreadPriorityRuls();
//            b.setName("B" + i);
//            b.setPriority(1);
//            b.start();
//            ThreadPriorityRuls a = new ThreadPriorityRuls();
//            a.setName("A" + i);
//            a.setPriority(10);
//            a.start();
//        }

        ThreadDeamon threadDeamon = new ThreadDeamon();
        threadDeamon.setDaemon(true);
        threadDeamon.start();
        Thread.sleep(1000);
        System.out.println("main线程停止，没有了非守护线程，守护线程停止");
    }
}
