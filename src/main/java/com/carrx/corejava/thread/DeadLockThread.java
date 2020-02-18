package com.carrx.corejava.thread;

/**
 * 死锁演示
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/2 11:27
 **/
public class DeadLockThread implements Runnable {

    private Object locka = new Object();
    private Object lockb = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (locka) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockb) {
                    System.out.println(i);
                }
            }
            synchronized (lockb) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (locka) {
                    System.out.println(i);
                }
            }
        }
    }
}
