package com.carrx.corejava.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程通信（等待唤醒机制）
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/3 5:30
 **/
public class ProducerConsumer {
    public static void main(String[] args) {
        Resource p = new Resource();
        Producer producer = new Producer(p);
        Consumer consumer = new Consumer(p);

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}

class Producer implements Runnable {
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.set("张三");
        }
    }
}

class Consumer implements Runnable {
    private Resource resource;

    public Consumer(Resource p) {
        this.resource = p;
    }

    @Override
    public void run() {
        while (true) {
            resource.get();
        }
    }
}

class Resource {
    boolean flag;
    private String name;
    private int count = 1;
    private Lock lock = new ReentrantLock();
    private Condition conditionProducer = lock.newCondition();
    private Condition conditionConsumer = lock.newCondition();


    public void set(String name) {
        lock.lock();
        try {
            while (flag) {
                try {
                    conditionConsumer.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name + "-----" + count++;
            System.out.println("生产者：" + this.name);
            flag = true;
            conditionProducer.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        lock.lock();
        try {
            while (!flag) {
                try {
                    conditionProducer.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者*******：" + this.name);
            flag = false;
            conditionConsumer.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
