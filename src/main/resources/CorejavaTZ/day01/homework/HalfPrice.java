package com.corejava.day01.homework;

//2.����
import java.util.Scanner;

public class HalfPrice {

	public static void main(String[] args) {
		//���嵥��
		double price = 10.0;
		
		//���빺������

		//1.����Scanner����
		Scanner sc = new Scanner(System.in);

		//3.���÷���
		System.out.println("�������빺������:");
		int count = sc.nextInt();

		//����ż�����ļ۸�
		double total = count / 2 * price + count / 2 * (price / 2);

		//�ж�count�Ǽ�������ż��
		if (count % 2 != 0) {
			total += price;
		}
		System.out.println("��һ����Ҫ����:" + total);

	}
}
