package com.carrx.corejava.thread;

import java.util.Calendar;

/**
 * 停止线程测试类
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/3 17:55
 **/
public class StopThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        StopThread stopThread = new StopThread();
        Thread t = new Thread(stopThread);
        t.start();
        Thread.sleep(10000);
        stopThread.changeFlag();
    }

}

class StopThread implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Calendar.getInstance().getTime());
        }
    }

    public void changeFlag() {
        flag = false;
    }
}