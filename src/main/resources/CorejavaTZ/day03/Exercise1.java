package com.corejava.day03;

import java.util.Date;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������:");
		int year = sc.nextInt();
		System.out.println("���������·�:");
		int month = sc.nextInt();
		System.out.println("������������:");
		int day = sc.nextInt();

		//����ָ����ʱ��
		Date time = new Date(year - 1900, month - 1, day);

		//��ȡָ��ʱ��ĺ�����
		long millis = time.getTime();

		//��ȡ��ǰϵͳʱ��ĺ�����
		long now = System.currentTimeMillis();

		//���������ȡ����ֵ,Ȼ��ת��������
		System.out.println("��������֮�����:" + Math.abs(millis - now) / 1000 / 60 / 60 / 24 + "��");
	}
}
