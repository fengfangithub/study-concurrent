package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description Suspend导致数据不同步
 * @date 2022/7/12 11:04
 */
public class ThreadSuspendNotSyn extends Thread{
    private SynObj synObj;

    @Override
    public void run() {
        if("A".equals(Thread.currentThread().getName())){
            synObj.setValue("aaa", "151");
        }else {
            synObj.printValue();
        }
    }

    public SynObj getSynObj() {
        return synObj;
    }

    public void setSynObj(SynObj synObj) {
        this.synObj = synObj;
    }
}
