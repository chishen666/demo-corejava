package com.corejava.day03;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入年份:");
		int year = sc.nextInt();
		System.out.println("请您输入月份:");
		int month = sc.nextInt();
		
		//重新设置时间
		cal.set(year, month - 1, 1);

		int weekday = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(weekday != 1 ? "星期" + (weekday - 1) : "星期天");
	}
}
