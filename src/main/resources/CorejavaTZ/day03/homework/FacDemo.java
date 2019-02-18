package com.corejava.day03.homework;

import java.util.Scanner;

public class FacDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个数字:");
		int num = sc.nextInt();
		long result = 1L;
		for (int i = num; i >= 1; i--) {
			result *= i;
		}
		System.out.println(num + "的阶乘是:" + result);
	}
}
