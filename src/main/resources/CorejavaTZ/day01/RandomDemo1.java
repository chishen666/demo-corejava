package com.corejava.day01;

/**
 * 本类用来演示Java产生随机数的两种方式
 * 
 * Math.random();
 *
 * 作者:JSD1412
 * 时间:2015-1-4 下午1:43:23
 */
public class RandomDemo1 {
	public static void main(String[] args) {
		System.out.println(Math.random());

		//改变范围
		System.out.println((int) (Math.random() * 10 + 1));
	}
}
