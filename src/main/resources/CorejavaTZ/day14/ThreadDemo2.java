package com.corejava.day14;

/**
 * 本类用来演示Java创建线程的两种方式
 * 写一个类实现java.lang.Runnable接口,并且重写run()方法
 *
 * 作者:JSD1412
 * 时间:2015-1-27 下午4:01:23
 */
public class ThreadDemo2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//获取当前正在执行的线程的命名,如果不命名,则系统提供默认名字
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//接口创建实现类
		Runnable r = new ThreadDemo2();
		
		//设置名字的方式
		Thread t1 = new Thread(r,"Jack");
		Thread t2 = new Thread(r,"Rose");
		
		//t1.setName("Jack");
		//t2.setName("Rose");
		
		//启动线程
		t1.start();
		t2.start();
	}

}
