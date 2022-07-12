package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description 同步方法
 * @date 2022/7/11 9:50
 */
public class SynObj {

    private String name = "a";
    private String age = "12";

    public synchronized void printStr() {
        System.out.println("当前调用线程：" + Thread.currentThread().getName());
        if("A".equals(Thread.currentThread().getName())){
            Thread.currentThread().suspend();
        }
    }

    public void setValue(String n, String a){
        this.name = n;
        if("A".equals(Thread.currentThread().getName())){
            System.out.println("停止线程A");
            Thread.currentThread().suspend();
        }
    }

    public void printValue(){
        System.out.println(name + "：" + age);
    }
}
