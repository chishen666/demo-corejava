package com.carrx.corejava.thread;

public class PriorityYieldThreadDemo {
    public static void main(String[] args) {
        PriorityYieldThread priorityYieldThread = new PriorityYieldThread();
        Thread t1 = new Thread(priorityYieldThread);
        Thread t2 = new Thread(priorityYieldThread);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}

class PriorityYieldThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + "------" + i);
        }
    }
}