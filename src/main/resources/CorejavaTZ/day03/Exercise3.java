package com.corejava.day03;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������:");
		int year = sc.nextInt();
		System.out.println("���������·�:");
		int month = sc.nextInt();
		
		//��������ʱ��
		cal.set(year, month - 1, 1);

		int weekday = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(weekday != 1 ? "����" + (weekday - 1) : "������");
	}
}
