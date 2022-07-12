package com.fengfan.chapter1;

/**
 * @author fengfan
 * @description suspend缺点
 * @date 2022/7/11 10:01
 */
public class ThreadSuspendDis extends Thread {
    private SynObj synObj;

    @Override
    public void run() {
        synObj.printStr();
    }

    public SynObj getSynObj() {
        return synObj;
    }

    public void setSynObj(SynObj synObj) {
        this.synObj = synObj;
    }
}
