package com.corejava.day10.String;

/**
 * 本类用来演示Java字符串的创建
 *
 * 作者:JSD1412
 * 时间:2015-1-19 上午9:22:43
 */
public class StringCreateDemo {
	public static void main(String[] args) {
		//字符串的创建方式
		//1.申请堆空间
		String s1 = new String("abc");
		String s2 = new String("abc");

		s1 += "";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		//2.申请串池
		String s3 = "abc";
		String s4 = "abc";

		//s3 += "";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		//构建一个空的默认16个字符的字符串容器
		StringBuilder builder1 = new StringBuilder();
		
		//构建一个空的指定初始化容量的字符串容器
		StringBuilder builder2 = new StringBuilder(10);
		
		//根据指定字符串构建StringBuilder容器
		StringBuilder builder3 = new StringBuilder("abc");
		StringBuilder builder4 = new StringBuilder("abc");
		System.out.println(builder3 == builder4);
		System.out.println(builder3.equals(builder4));//false,StringBuilder中没有重写equals()方法
	}
}
