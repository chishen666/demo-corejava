package com.carrx.corejava.thread;

/**
 * join方法测试
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/4 9:37
 **/
public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        Thread t1 = new Thread(joinThread);
        Thread t2 = new Thread(joinThread);
        t1.start();
        t2.start();
        t1.join();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + "------" + i);
        }
    }
}

class JoinThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + "------" + i);
        }
    }
}
