package com.carrx.corejava.thread;

/**
 * 多线程通信（等待唤醒机制）
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/3 5:30
 **/
public class WaitNotifyDemo {
    public static void main(String[] args) {
        Person p = new Person();
        new Thread(new Input(p)).start();
        new Thread(new Output(p)).start();
    }
}

class Input implements Runnable {
    private Person p;

    public Input(Person p) {
        this.p = p;
    }

    @Override
    public void run() {
        boolean switchFlag = true;
        while (true) {
            if (switchFlag) {
                p.set("张三", "男");
            } else {
                p.set("lisisi", "girl");
            }
            switchFlag = !switchFlag;
        }
    }
}

class Output implements Runnable {
    private Person p;

    public Output(Person p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.get();
        }
    }
}

class Person {
    boolean flag;
    private String name;
    private String sex;

    public synchronized void set(String name, String sex) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        notify();
    }

    public synchronized void get() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + " ====== " + this.sex);
        flag = false;
        notify();
    }
}
