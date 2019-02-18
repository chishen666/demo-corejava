package com.carrx.corejava.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
	public static void main(String[] args) {
		// testNestedClass();
		testLamdba();
	}

	/**
	 * 内部类演示
	 */
	public static void testNestedClass() {
		new Object() {
			public void test() {
				System.out.println("test");
			}
		}.test();

		new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("extends Thread");
			}
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("implements Runnable");
			}
		}).start();
	}

	/**
	 * 自定义函数接口演示
	 */
	public static void testLamdba() {
		InterfaceA ia = () -> {
			System.out.println(123);
		};
		ia.test();
	}

	/**
	 * 内置函数接口演示
	 */
	@SuppressWarnings("unused")
	public static void testFunctionalInterface() {
		Function<Integer, Integer> funciton = a -> a;

		Consumer<Integer> consumer = a -> {
		};

		Predicate<Integer> predicate = a -> a.equals(a);
	}


}
