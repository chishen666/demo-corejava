package com.carrx.corejava.datastructure.queue;

/**
 * 循环队列：数组实现（解决假溢出问题）
 */
public class ArrayCircularQueue<T> {
    private T[] datas;

    private int maxSize;

    private int head;

    private int tail;

    public ArrayCircularQueue(int maxSize) {
        if (maxSize < 1) {
            maxSize = 10;
        }
        this.maxSize = maxSize;
        this.datas = (T[]) new Object[maxSize];
    }

    /**
     * 队列是否为空
     *
     * @return
     */
    private boolean isNull() {
        return head == tail;
    }

    /**
     * 队列是否已满
     *
     * @return
     */
    private boolean isFull() {
        return (tail + 1) % maxSize == head;
    }

    /**
     * 队列添加元素
     *
     * @param t
     * @return
     */
    public boolean push(T t) {
        if (isFull()) {
            return false;
        } else {
            datas[tail] = t;
            tail = (tail + 1) % maxSize;
            return true;
        }
    }

    /**
     * 队列移除元素
     *
     * @return
     */
    public boolean pop() {
        if (isNull()) {
            return false;
        } else {
            datas[head] = null;
            head = (head + 1) % maxSize;
            return true;
        }
    }

    public T[] getDatas() {
        return datas;
    }
}
