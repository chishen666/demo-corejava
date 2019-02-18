package com.corejava.day04.method;

import java.util.Scanner;

public class TestPlus4 {

	public static void main(String[] args) {
		Plus4 ps = new Plus4();
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入被加数:");
		int a = sc.nextInt();
		System.out.println("请您输入加数:");
		int b = sc.nextInt();
		int r = ps.add(a, b);
		System.out.println(r);
	}
}
