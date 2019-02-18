package com.corejava.day01;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入第一个数字:");
		int a = sc.nextInt();
		System.out.println("请您输入第二个数字:");
		int b = sc.nextInt();
		int r = a + b;
		System.out.println("计算结果为:" + r);
		sc.close();
	}
}
