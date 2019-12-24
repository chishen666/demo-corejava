package com.carrx.corejava.datastructure.queue;

/**
 * 顺序队列：数组实现（会有假溢出问题哦）
 *
 * @param <T>
 */
public class ArrayQueue<T> {
    private T[] datas;

    private int maxSize;

    private int head;

    private int tail;

    public ArrayQueue(int maxSize) {
        if (maxSize < 1) {
            maxSize = 10;
        }
        this.maxSize = maxSize;
        this.datas = (T[]) new Object[maxSize];
    }

    /**
     * 队列为空
     */
    public boolean isNull() {
        return head == tail;
    }

    /**
     * 队列已满
     */
    public boolean isFull() {
        return tail == maxSize;
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
            tail += 1;
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
            head += 1;
            return true;
        }
    }

    public T[] getDatas() {
        return datas;
    }

}
