package com.fengfan.chapter2;

/**
 * @author fengfan
 * @description 验证volatile不能保证原子性
 * @date 2022/7/26 9:28
 */
public class SynVolatile {
    volatile int a;

    public void addA(){
        a++;
    }

}
