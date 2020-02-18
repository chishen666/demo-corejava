package com.carrx.corejava.thread;

/**
 * 测试线程1
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/21 10:35
 **/
public class Thread1 extends Thread {
    private static int count = 5;

    public Thread1() {
    }

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
//        synchronized (this.getClass()) {
        while (count > 0) {
            System.out.println(this.getName() + "--------------->" + count--);
        }
//        }
    }
}
