package com.corejava.day01;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������һ������:");
		int a = sc.nextInt();
		System.out.println("��������ڶ�������:");
		int b = sc.nextInt();
		int r = a + b;
		System.out.println("������Ϊ:" + r);
		sc.close();
	}
}
