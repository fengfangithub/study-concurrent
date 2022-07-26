package com.fengfan.chapter2;

/**
 * @author fengfan
 * @description 实例
 * @date 2022/7/26 13:55
 */
public class SynObj {
    private static int i = 0;

    public synchronized void addI(){
        i++;
    }

    public synchronized int getI(){
        return i;
    }

    public synchronized static void addStaticI(){
        i++;
    }

    public void synBlock(){

        synchronized (this){
            i++;
        }

    }
}
