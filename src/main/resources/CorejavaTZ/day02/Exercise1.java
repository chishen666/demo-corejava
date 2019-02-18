package com.corejava.day02;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个三位整数:");
		int num = sc.nextInt();

		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;

		System.out.println(num + "的个位是:" + g);
		System.out.println(num + "的十位是:" + s);
		System.out.println(num + "的百位是:" + b);
	}
}
