package com.corejava.day10;

/**
 * ����������ʾBoolean��װ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����4:40:04
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
