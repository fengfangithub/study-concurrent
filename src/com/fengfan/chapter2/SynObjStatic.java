package com.fengfan.chapter2;

/**
 * @author fengfan
 * @description synchronized 修饰当前类
 * @date 2022/8/4 14:33
 */
public class  SynObjStatic implements Runnable {
    private static int i = 0;

    @Override
    public void run() {
        synchronized (SynObjStatic.class){
            i++;
        }
    }

    public static int getI(){
        return i;
    }
}
