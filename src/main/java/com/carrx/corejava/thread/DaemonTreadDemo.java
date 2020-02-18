package com.carrx.corejava.thread;

import java.util.Calendar;

/**
 * 守护线程测试类
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/3 17:38
 **/
public class DaemonTreadDemo {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread daemonThread = new DaemonThread();
        Thread t = new Thread(daemonThread);
        t.setDaemon(true);
        t.start();
        Thread.sleep(10000);
    }
}

class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Calendar.getInstance().getTime());
        }
    }
}
