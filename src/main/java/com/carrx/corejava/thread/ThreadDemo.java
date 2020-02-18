package com.carrx.corejava.thread;

/**
 * 多线程测试类
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/21 9:49
 **/
public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
//        Thread thread1_1 = new Thread1("thread1_1");
//        thread1_1.start();

//        Thread thread1_2 = new Thread1("thread1_2");
//        thread1_2.start();

//        Runnable runnable = new Thread2();
//        Thread thread2_1 = new Thread(runnable, "thread2_1");
//        Thread thread2_2 = new Thread(runnable, "thread2_2");
//        Thread thread2_3 = new Thread(runnable, "thread2_3");
//        Thread thread2_4 = new Thread(runnable, "thread2_4");
//        thread2_1.start();
//        thread2_2.start();
//        thread2_3.start();
//        thread2_4.start();


        DeadLockThread deadLockThread = new DeadLockThread();
        Thread thread3_1 = new Thread(deadLockThread);
        Thread thread3_2 = new Thread(deadLockThread);
        thread3_1.start();
        thread3_2.start();

    }
}
