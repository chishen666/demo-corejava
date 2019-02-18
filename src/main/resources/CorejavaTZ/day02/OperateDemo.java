package com.corejava.day02;

/**
 * 本类用来演示Java运算符
 *
 * 作者:JSD1412
 * 时间:2015-1-5 上午11:17:11
 */
public class OperateDemo {

	public static void main(String[] args) {
		
		byte b = 127;
		//b = b + 1;类型问题,编译错误
		
		b += 1;//避免类型安全问题
		
		System.out.println(b);//结果还是不正确
		
		//&	按位与
		System.out.println(7 & 2);

		//|	按位或
		System.out.println(7 | 2);

		//^	按位异或
		System.out.println(7 ^ 2);

		//~	按位取反
		System.out.println(~6);
	}
}
