package com.corejava.day02;

/**
 * 本类用来演示Java基本数据类型
 *
 * 作者:JSD1412
 * 时间:2015-1-4 下午3:57:47
 */
public class DataTypeDemo {
	public static void main(String[] args) {
		
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 100;
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		//随意写一个小数,默认是double类型
		//float f = 3.14;编译错误
		double d = 3.14;

		boolean bool = false;
		System.out.println(bool);

		char c1 = 'A';//65
		char c2 = 'a';//97
		char c3 = '0';//48
		char c4 = '\u597d';//unicode编码,十六进制数字
		char c5 = '\n';//特殊符号
		char c6 = '\t';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5 + "Test");
		System.out.println(c6 + "Test");

		//A到Z中的随机字符,65~90
		System.out.println((char) ((int) (Math.random() * 26 + 65)));
		
		//例如:
		char cc1 = '3';
		char cc2 = '5';
		int i1 = cc1 - '0';//快速转换字符成对应整数
		int i2 = cc2 - '0';
		System.out.println(i1 + i2);
	}
}
