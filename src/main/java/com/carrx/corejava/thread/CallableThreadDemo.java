package com.carrx.corejava.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableThreadDemo {
    public static void main(String[] args) throws Exception {
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask(callableThread);
        new Thread(futureTask).start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            boolean bool = futureTask.isDone();
            System.out.println(bool);
//            if (bool) {
            System.out.println(futureTask.get());
//            }
        }
    }

}

class CallableThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 123;
    }
}
