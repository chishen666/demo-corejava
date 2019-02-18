package com.corejava.day10;

/**
 * 本类用来演示Boolean包装类
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午4:40:04
 */
public class BooleanDemo {
	public static void main(String[] args) {
		Boolean bool1 = new Boolean(false);
		System.out.println(bool1);
		
		Boolean bool2 = new Boolean("TrUe");
		System.out.println(bool2);
		
		boolean bool3 = Boolean.parseBoolean("TrUe");
		System.out.println(bool3);
	}
}
