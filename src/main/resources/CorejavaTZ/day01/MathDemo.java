package com.corejava.day01;

/**
 * 本类用来演示java.lang.Math,数学类
 * 
 * 此类提供了数学相关的常用方法
 *
 * 作者:JSD1412
 * 时间:2014-12-31 下午2:41:20
 */
public class MathDemo {
	public static void main(String[] args) {
		
		//获取PI值
		System.out.println("PI = " + Math.PI);

		//求绝对值
		System.out.println("-8的绝对值是:" + Math.abs(-8));

		//求最大值和最小值
		System.out.println("较大值是:" + Math.max(3, 8));

		System.out.println("较小值是:" + Math.min(9, 2));

		//练习:求出2,9,5中最小值
		System.out.println("较小值是:" + Math.min(Math.min(9, 2), 5));

		//指数运算,2的4次方
		System.out.println(Math.pow(2, 4));

		//平方根
		System.out.println(Math.sqrt(9));

		//求随机数,范围[0,1)
		System.out.println(Math.random());

		//改变范围,1-9的随机整数
		System.out.println((int) (Math.random() * 9 + 1));
	}
}
