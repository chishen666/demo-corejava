package com.corejava.day14;

/**
 * 本类用来演示Java创建多线程的两种方式
 * 写一个类继承java.lang.Thread类并且重写run()方法
 *
 * 作者:JSD1412
 * 时间:2015-1-27 下午3:52:08
 */
public class ThreadDemo1 extends Thread {
	
	//通过构造给线程命名
	public ThreadDemo1(String name) {
		super(name);
	}

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
		//创建线程对象
		Thread t1 = new ThreadDemo1("Jack");
		Thread t2 = new ThreadDemo1("Rose");
		
		//获取线程优先级,默认是5级
		//System.out.println(t1.getPriority());
		//System.out.println(t2.getPriority());
		
		//设置线程优先级
		t1.setPriority(1);//t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);//t2.setPriority(Thread.MAX_PRIORITY);
		
		//给线程命名
		//t1.setName("Jack : ");
		//t2.setName("Rose : ");
		
		//启动线程
		t1.start();
		t2.start();
	}
}
