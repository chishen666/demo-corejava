package com.corejava.day02;

/**
 * 本类用来演示通过Java程序计算进制
 *
 * 作者:JSD1412
 * 时间:2015-1-5 下午2:03:11
 */
public class BinaryDemo {
	
	public static void main(String[] args) {
		
		//求任意数字的二进制
		System.out.println(Integer.toBinaryString(-7));
		
		//求任意数字的八进制
		System.out.println(Integer.toOctalString(22));

		//求任意数字的十六进制
		System.out.println(Integer.toHexString(15));
		
		//把任意进制的字符串转换成十进制数字
		System.out.println(Integer.parseInt("111", 2));
	}
}
