package com.corejava.day10.String;

/**
 * 本类用来演示Java字符串的拼接操作
 *
 * 作者:JSD1412
 * 时间:2015-1-19 上午9:41:06
 */
public class StringAppendDemo {
	public static void main(String[] args) {
		long m1 = Runtime.getRuntime().freeMemory();//返回Java虚拟机中的空闲内存量。
		System.out.println(m1);
		long l1 = System.currentTimeMillis();
		method2();
		long m2 = Runtime.getRuntime().freeMemory();
		System.out.println(m2);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
	}

	//使用+拼接
	public static void method1() {
		String s = "a";
		for (int i = 0; i < 100000; i++) {
			s += "b";
		}
	}

	//append拼接
	public static void method2() {
		StringBuilder builder = new StringBuilder("a");
		for (int i = 0; i < 100000; i++) {
			builder.append("b");
		}
	}
}
