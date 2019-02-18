package com.corejava.day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * �ڿ���̨�ϲ�ͣ�Ĵ�ӡʱ��,��¼ÿ����ʱ�������
 * 2015-1-6 14:35:34
 * 2015-1-6 14:35:35
 * 2015-1-6 14:35:36
 * ...
 * ÿ������,���������!
 */
public class Exercise5 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Scanner sc = new Scanner(System.in);
		System.out.println("�������붨ʱСʱ:");
		int hour = sc.nextInt();
		System.out.println("�������붨ʱ����");
		int min = sc.nextInt();

		for (;;) {
			Calendar cal = Calendar.getInstance();

			if (cal.get(Calendar.HOUR_OF_DAY) == hour
					&& cal.get(Calendar.MINUTE) == min
					&& cal.get(Calendar.SECOND) <= 30) {
				System.err.print("\n����!!!\r");
			} else {
				System.out.print(sdf.format(cal.getTime()) + "\r");
			}
			//��ͣ1����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
