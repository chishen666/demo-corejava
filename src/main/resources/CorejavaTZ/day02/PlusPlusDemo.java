package com.corejava.day02;

/**
 * ����������ʾJava�����Լ�
 *
 * ����:JSD1412
 * ʱ��:2015-1-5 ����11:22:19
 */
public class PlusPlusDemo {
	public static void main(String[] args) {
		int a1 = 3;
		int b1 = a1++;//��++
		System.out.println(a1);//4
		System.out.println(b1);//3

		int a2 = 3;
		int b2 = ++a2;//ǰ++
		System.out.println(a2);//4
		System.out.println(b2);//4

		int a = 10;
		int b = a++ + ++a;//a = 12,b = 22
		int r = a++ + --a - --b;//12 + 12 - 21 = 3
		System.out.println(r);

	}
}
