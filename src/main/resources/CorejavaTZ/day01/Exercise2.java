package com.corejava.day01;

import java.util.Scanner;

/**
	���еش�	16 + 0.2 * min
	������		0.6 * min
	
	��������ÿ�µ绰������:60
	
	������:xxx
	���еش�:xxx
	ѡ��:xxx���Ӻ���.
*/
public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ÿ�µ绰������:");
		int min = sc.nextInt();
		double dgdd = 16 + 0.2 * min;
		double szx = 0.6 * min;
		System.out.println("���еش���Ҫ����:" + dgdd + "Ԫ.");
		System.out.println("��������Ҫ����:" + szx + "Ԫ.");

		//System.out.println(dgdd >= szx ? "������" : "���еش�");

		if (dgdd < szx) {
			System.out.println("���еش�");
		} else if (dgdd > szx) {
			System.out.println("������");
		} else {
			System.out.println("����");
		}
	}
}
