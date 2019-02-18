package com.corejava.day04.method;

import java.util.Scanner;

public class Plus1 {
	public static void main(String[] args) {
		//创建对象,调用谁的方法,就创建谁的对象
		Plus1 ps = new Plus1();
		ps.add();
	}

	//自定义加法
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入第一个数字:");
		int i = sc.nextInt();
		System.out.println("请您输入第二个数字:");
		int j = sc.nextInt();
		System.out.println("计算结果为:" + (i + j));

		//此处没有返回值,则return可以省略
		//return;
	}

	public void method() {
		int score = 9;
		if (score < 60) {
			System.out.println("不及格");
			return;
		}
		System.out.println("及格");
	}
}
