package com.corejava.day03;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercise4 {

	/**
	 * ��ϰ:�������,��ȡ���������껹��ƽ��
	 * 
	 * ��ݿ�������4���ǲ�������100,������ݿ���ֱ������400,��������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			System.out.println("�����������:");
			int year = sc.nextInt();
	
			//1.
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + "��������.");
			} else {
				System.out.println(year + "����ƽ��.");
			}
		}

		//2.
		/*if (new GregorianCalendar().isLeapYear(year)) {
			System.out.println(year + "��������.");
		} else {
			System.out.println(year + "����ƽ��.");
		}*/
	}
}
