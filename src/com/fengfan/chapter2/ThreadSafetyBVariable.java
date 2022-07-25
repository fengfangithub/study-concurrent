package com.fengfan.chapter2;

/**
 * @author fengfan
 * @description 方法内的变量为线程安全
 * @date 2022/7/14 13:39
 */
public class ThreadSafetyBVariable extends Thread{
    private SynObjet synObjet;

    public ThreadSafetyBVariable(SynObjet synObjet) {
        this.synObjet = synObjet;
    }

    @Override
    public void run() {
        synObjet.printValue();
    }
}
