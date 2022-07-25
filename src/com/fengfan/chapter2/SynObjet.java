package com.fengfan.chapter2;

/**
 * @author fengfan
 * @description 对象
 * @date 2022/7/14 13:40
 */
public class SynObjet {

    private int a;

    public void printValue(){
        try {
            int num = 0;
            if("A0".equals(Thread.currentThread().getName())){
                num = 100;
                Thread.sleep(200);
            }else {
                num = 200;
            }
            System.out.println(Thread.currentThread().getName() + "运行结果：" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printA(){
        try {
            if("A0".equals(Thread.currentThread().getName())){
                a = 100;
                Thread.sleep(200);
            }else {
                a = 200;
            }
            System.out.println(Thread.currentThread().getName() + "运行结果：" + a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
