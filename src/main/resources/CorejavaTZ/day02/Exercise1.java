package com.corejava.day02;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������һ����λ����:");
		int num = sc.nextInt();

		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;

		System.out.println(num + "�ĸ�λ��:" + g);
		System.out.println(num + "��ʮλ��:" + s);
		System.out.println(num + "�İ�λ��:" + b);
	}
}
