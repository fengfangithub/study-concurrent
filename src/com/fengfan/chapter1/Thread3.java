package com.fengfan.chapter1;

import java.util.concurrent.Callable;

/**
 * @author fengfan
 * @description 实现Callable接口
 * @date 2022/7/1 14:47
 */
public class Thread3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("线程名称：" + Thread.currentThread().getName() + ",运行完成");
        return "hellow world";
    }
}
