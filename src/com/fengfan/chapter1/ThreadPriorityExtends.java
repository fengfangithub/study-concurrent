package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 线程优先级继承
 * @date 2022/7/12 15:22
 */
public class ThreadPriorityExtends extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName() + "的先优先级：" + this.getPriority());
        Thread b = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "的先优先级：" + this.getPriority());

        });
        b.setName("B");
        b.start();
    }
}
