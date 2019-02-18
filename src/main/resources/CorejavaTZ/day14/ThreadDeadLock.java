package com.corejava.day14;

/**
 * 线程死锁现象
 */
public class ThreadDeadLock implements Runnable{
	//状态变量
	public int flag = 1;
	
	//静态对象只产生一个,造成死锁
	static Object o1 = new Object();
	static Object o2 = new Object();
	
	@Override
	public void run() {
		System.out.println("flag=" + flag);
		if(flag == 1){
			synchronized (o1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("1");
				}
			}
		}
		if(flag == 0){
			synchronized (o2) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("0");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDeadLock td1 = new ThreadDeadLock();
		ThreadDeadLock td2 = new ThreadDeadLock();
		td1.flag = 0;
		td2.flag = 1;
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		t1.start();
		t2.start();
	}
}
