package com.fengfan.chapter2;

/**
 * @author fengfan
 * @description 运行类
 * @date 2022/7/14 11:19
 */
public class ChapterMain2 {

//    private volatile static int number = 0;
//    private volatile static boolean flag = false;
//    private volatile static int value = 1;

    public static void main(String[] args) throws Exception {

        //线程A一直循环，等待其他线程修改number的值，中断while停止
//        new Thread(() -> {
//            while (number == 0){
//                System.out.println("我是线程A，等待线程B修改number的值来停止");
//            }
//            System.out.println("number的值已经修改啦");
//        }).start();
//
//        new Thread(() -> {
//            number = 1;
//            System.out.println("我是线程B，修改了number的值");
//        }).start();

//        Thread a =  new Thread(() -> {
//            flag = true;
//            value = 1024;
//        });
//
//        Thread b = new Thread(() -> {
//           if(flag) {
//               System.out.println("flag的值为ture，value为" + value);
//           }else {
//               System.out.println("flag的值为false，value为" + value);
//           }
//            System.out.println("==========================================");
//        });
//
//        for(int i = 0; i < 10; i++){
//            value = 1;
//            flag = false;
//            Thread aa = new Thread(a);
//            Thread bb = new Thread(b);
//            aa.start();
//            bb.start();
//            Thread.sleep(1000);
//        }

//        SynVolatile synVolatile = new SynVolatile();
//        for (int i = 0; i < 100000; i++) {
//            new Thread(synVolatile::addA).start();
//        }
//        while (Thread.activeCount() > 2) {
//            Thread.yield();
//        }
//        System.out.println("运算过后A的值：" + synVolatile.a);

        SynObj synObj = new SynObj();
//        for (int i = 0; i < 1000; i++) {
//            new Thread(synObj::addI).start();
//        }

//        for(int i = 0; i < 1000; i++){
//            new Thread(SynObj::addStaticI).start();
//        }

        for(int i = 0; i < 1000; i++){
            new Thread(synObj::synBlock).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("synObj运行结果为：" + synObj.getI());


    }
}
