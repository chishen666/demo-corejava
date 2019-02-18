package com.carrx.corejava.thread;

import java.util.concurrent.FutureTask;

public class ThreadDemo {

	public static void main(String[] args) {
		//		testExtendsThread();
		//		testImplementsRunnable();
		testImplementsCallable();
		//		testMain
	}

	static void testMain() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}

	static void testExtendsThread() {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		}.start();
	}

	static void testImplementsRunnable() {
		Runnable runnable = new Runnable() {
			private int i = 10;

			@Override
			public void run() {
				while (i > 0) {
					try {
						Thread.sleep(10);
						synchronized (this) {
							System.out.println(Thread.currentThread().getName() + "**********" + i--);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		new Thread(runnable).start();
		new Thread(runnable).start();
	}

	static void testImplementsCallable() {
		FutureTask<String> ft = new FutureTask<>(() -> "123");
		new Thread(ft).start();

	}
}
