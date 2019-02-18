package com.corejava.day02;

/**
 * 本类用来演示Java自增自减
 *
 * 作者:JSD1412
 * 时间:2015-1-5 上午11:22:19
 */
public class PlusPlusDemo {
	public static void main(String[] args) {
		int a1 = 3;
		int b1 = a1++;//后++
		System.out.println(a1);//4
		System.out.println(b1);//3

		int a2 = 3;
		int b2 = ++a2;//前++
		System.out.println(a2);//4
		System.out.println(b2);//4

		int a = 10;
		int b = a++ + ++a;//a = 12,b = 22
		int r = a++ + --a - --b;//12 + 12 - 21 = 3
		System.out.println(r);

	}
}
