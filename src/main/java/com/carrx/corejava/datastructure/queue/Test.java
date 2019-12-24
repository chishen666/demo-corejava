package com.carrx.corejava.datastructure.queue;

public class Test {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>(3);
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());

        arrayQueue.push(1);

        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());

        arrayQueue.push(1);
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());

        arrayQueue.push(1);
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());

        arrayQueue.pop();
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());

        arrayQueue.pop();
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());

        arrayQueue.pop();
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isNull());
    }
}
