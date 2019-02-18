package com.corejava.util;

import java.util.Scanner;

/**输入工具类*/
public class InputUtil {
	
	//全局变量,属性
	private static Scanner sc = new Scanner(System.in);

	/**
	 * 获取用户键盘输入的整数
	 */
	public static int inputInt(String message) {
		System.out.println(message);
		return sc.nextInt();
	}

	/**
	 * 获取用户键盘输入的小数
	 */
	public static double inputDouble(String message) {
		System.out.println(message);
		return sc.nextDouble();
	}

	/**
	 * 获取用户键盘输入的字符串
	 */
	public static String inputLine(String message) {
		System.out.println(message);
		return sc.nextLine();
	}
}
