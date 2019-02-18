package com.corejava.day03.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProductCalc {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		System.out.println("�����������:");
		int year = sc.nextInt();
		System.out.println("���������·�:");
		int month = sc.nextInt();
		System.out.println("������������:");
		int day = sc.nextInt();

		//����ָ����ʱ��
		Date time = new Date(year - 1900, month - 1, day);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������������(yyyy-MM-dd):");
		String createStr = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date createDate = sdf.parse(createStr);
			
			System.out.println("�������뱣����:");
			int days = sc.nextInt();

			long l = createDate.getTime() + 1000L * 60 * 60 * 24 * days;

			createDate.setTime(l);

			System.out.println(createDate.before(new Date()) ? "����" : "δ����");
			
		} catch (ParseException e) {
			//e.printStackTrace();
			System.err.println("�Բ���,������������!");
		}
	}
}
