package com.corejava.day04.method;

import java.util.Scanner;

public class MathSystem {

	/**
	 * 服务方法
	 */
	public void service() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			printMenu();
			System.out.print("请您选择:");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("请您输入第一个数字:");
				int a = sc.nextInt();
				System.out.println("请您输入第二个数字:");
				int b = sc.nextInt();
				int result = getMax(a, b);
				System.out.println(a + "和" + b + "中较大的数是:" + result);
			} else if (choice == 2) {

			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {
				System.out.println("~谢谢使用~");
				break;
			} else {
				System.err.println("对不起,您的输入有误,请重新输入!");
			}
		}
	}

	/**
	 * 打印程序主界面
	 */
	public void printMenu() {
		System.out.println("===欢迎使用===");
		System.out.println("1.求较大值");
		System.out.println("2.求二进制");
		System.out.println("3.求平方根");
		System.out.println("4.求指数值");
		System.out.println("5.退出");
		System.out.println("==============");
	}

	/**
	 * 求较大值
	 * @param a		第一个比较数
	 * @param b		第二个比较数
	 * @return		较大值
	 */
	public int getMax(int a, int b) {
		int result = Math.max(a, b);
		return result;
	}

	/**
	 * 求二进制字符串
	 * @param num	需要转换的十进制数字
	 * @return		二进制字符串
	 */
	public String getBinary(int num) {
		String binary = Integer.toBinaryString(num);
		return binary;
	}

	/**
	 * 求平方根
	 * @param num	被开方的数字
	 * @return		平方根
	 */
	public double getSqrt(int num) {
		double result = Math.sqrt(num);
		return result;
	}

	/**
	 * 求指数值
	 * @param a 底数
	 * @param b 指数
	 * @return	 指数值
	 */
	public double getPow(int a, int b) {
		double result = Math.pow(a, b);
		return result;
	}
}
