package com.corejava.day10.String;

/**
 * 本类用来演示StringBuilder中的常用方法
 *
 * 作者:JSD1412
 * 时间:2015-1-19 下午2:29:34
 */
public class StringBuilderMethodDemo {
	
	//默认16个字符的缓冲单位
	private static StringBuilder builder = new StringBuilder();
	//private static StringBuffer buffer = new StringBuffer();
	
	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder(10);
		StringBuilder builder2 = new StringBuilder("ABC");
		
		//获取字符串容器容量大小
		int cap = builder2.capacity();
		System.out.println(cap);
		
		//获取字符串容器中内容的多少
		int length = builder2.length();
		System.out.println(length);
		
		//1.拼接方法,效率非常高
		builder = builder.append("A").append("B").append("C");
		System.out.println(builder);
		
		//2.删除字符串中指定区间的字符串
		StringBuilder builder3 = new StringBuilder("你好,Hello,我是Java").delete(3, 9);
		System.out.println(builder3);
	
		//删除字符串指定下标处的字符
		StringBuilder builder4 = new StringBuilder("ABC").deleteCharAt(1);
		System.out.println(builder4);
		
		//3.在字符串中插入指定内容的字串
		StringBuilder builder5 = new StringBuilder("AF").insert(1, "BCDE");
		System.out.println(builder5);
		
		//4.替换字符串
		StringBuilder builder6 = new StringBuilder("AbcdeF").replace(1, 5, "Z");
		System.out.println(builder6);
		
		//5.反转当前字符串序列
		StringBuilder builder7 = new StringBuilder("AbcdeF");
		builder7 = builder7.reverse();
		System.out.println(builder7);
		
		//6.修改字符序列指定下标处的字符
		StringBuilder builder8 = new StringBuilder("AbC");
		builder8.setCharAt(1, 'B');//返回类型void
		System.out.println(builder8);
		
		//7.设置新长度
		StringBuilder builder9 = new StringBuilder("ABCDEFG");
		builder9.setLength(10);
		System.out.println(builder9);
	}
}
