package com.corejava.day04.method;

import java.util.Scanner;

public class Plus2 {
	/*public static void main(String[] args) {
		//������õķ�����static��,�����ֱ��������.����������
		Plus2.add();
		
		//��������õľ�̬�������Լ��ڲ�,��ֱ�ӷ������Ϳ��Ե���
		add();
	}*/
	
	//�Զ���ӷ�(��̬����)
	public static void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������һ������:");
		int i = sc.nextInt();
		System.out.println("��������ڶ�������:");
		int j = sc.nextInt();
		System.out.println("������Ϊ:" + (i + j));
	}
}
