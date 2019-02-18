package com.corejava.day10.String;

/**
 * ����������ʾJava�ַ�����ƴ�Ӳ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-19 ����9:41:06
 */
public class StringAppendDemo {
	public static void main(String[] args) {
		long m1 = Runtime.getRuntime().freeMemory();//����Java������еĿ����ڴ�����
		System.out.println(m1);
		long l1 = System.currentTimeMillis();
		method2();
		long m2 = Runtime.getRuntime().freeMemory();
		System.out.println(m2);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
	}

	//ʹ��+ƴ��
	public static void method1() {
		String s = "a";
		for (int i = 0; i < 100000; i++) {
			s += "b";
		}
	}

	//appendƴ��
	public static void method2() {
		StringBuilder builder = new StringBuilder("a");
		for (int i = 0; i < 100000; i++) {
			builder.append("b");
		}
	}
}
