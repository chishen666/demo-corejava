package com.corejava.day04.method;

import java.util.Scanner;

public class Plus1 {
	public static void main(String[] args) {
		//��������,����˭�ķ���,�ʹ���˭�Ķ���
		Plus1 ps = new Plus1();
		ps.add();
	}

	//�Զ���ӷ�
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������һ������:");
		int i = sc.nextInt();
		System.out.println("��������ڶ�������:");
		int j = sc.nextInt();
		System.out.println("������Ϊ:" + (i + j));

		//�˴�û�з���ֵ,��return����ʡ��
		//return;
	}

	public void method() {
		int score = 9;
		if (score < 60) {
			System.out.println("������");
			return;
		}
		System.out.println("����");
	}
}
