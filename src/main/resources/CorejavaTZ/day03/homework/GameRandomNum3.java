package com.corejava.day03.homework;

import java.util.Scanner;

public class GameRandomNum3 {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 100 + 1);

		System.out.println(num1);

		Scanner sc = new Scanner(System.in);


		int big = 100, small = 1;

		//System.out.println("��������µ�����1-100:");

		for (int i = 0; i < 6; i++) {
			System.out.println("��������µ�����" + small + "-" + big);
			int num2 = sc.nextInt();

			if (num2 > num1 && num2 <= big) {
				System.out.print("̫���ˣ�");
				big = num2;
				//System.out.println("��������µ�����" + small + "-" + big);

			} else if (num2 < num1 && num2 >= small) {
				System.out.print("̫С�ˣ�");
				small = num2;
				//System.out.println("��������µ�����" + small + "-" + big);

			} else if (num1 == num2) {
				System.out.println("��ϲ�㣬�¶��ˣ�");
				System.out.println("��һ������" + (i + 1) + "�Σ�");
				break;
			} else {
				System.out.println("�Բ�����µ������Ϸ���");
				break;
			}
		}

	}

}
