package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 线程停止--异常法
 * @date 2022/7/7 15:44
 */
public class ThreadStopExc extends Thread{
    @Override
    public void run() {
        try {
            for(int i = 0; i < 10000; i ++){
                if(this.isInterrupted()){
                    throw new InterruptedException();
                }
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("进入run方法的catch");
        }
    }
}
