package com.carrx.corejava.thread;

/**
 * 测试线程2
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/21 16:55
 **/
public class Thread2 implements Runnable {

    private static int count = 100;
    private static Thread2 t = new Thread2();

    public static synchronized void m2() {
        if (count > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--------------->" + count--);
        }
    }

    @Override
    public void run() {
        while (true) {

//            synchronized (this) {
//
//                if (count > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "--------------->" + count--);
//                }
//            }
            t.m1();
            t.m2();
            if (count <= 0) {
                break;
            }
        }
    }

    public synchronized void m1() {
        if (count > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--------------->" + count--);
        }
    }
}
