package com.carrx.corejava.datastructure.queue;

/**
 * 顺序队列：链表实现
 */
public class LinkedQueue<T> {

    private int size;

    private Node<T> head;

    private Node<T> tail;

    public LinkedQueue(int size) {
        this.size = size;
    }

    public boolean isNull() {
        return size ==
                0;
    }

    public boolean push(T t) {
        Node node = new Node(t);
        if (isNull()) {
            head = node;
            tail = node;
            head.next = tail;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    public T pop() {
        if (isNull()) {
            return null;
        } else {
            T t = head.data;
            if (head.next == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            size--;
            return t;
        }
    }

    class Node<T> {

        private T data;

        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
