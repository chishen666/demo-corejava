package com.corejava.day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 在控制台上不停的打印时间,记录每秒钟时间的流逝
 * 2015-1-6 14:35:34
 * 2015-1-6 14:35:35
 * 2015-1-6 14:35:36
 * ...
 * 每个整点,输出整点啦!
 */
public class Exercise5 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入定时小时:");
		int hour = sc.nextInt();
		System.out.println("请您输入定时分钟");
		int min = sc.nextInt();

		for (;;) {
			Calendar cal = Calendar.getInstance();

			if (cal.get(Calendar.HOUR_OF_DAY) == hour
					&& cal.get(Calendar.MINUTE) == min
					&& cal.get(Calendar.SECOND) <= 30) {
				System.err.print("\n起床啦!!!\r");
			} else {
				System.out.print(sdf.format(cal.getTime()) + "\r");
			}
			//暂停1秒钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
