package com.corejava.day03;

import java.util.Date;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入年份:");
		int year = sc.nextInt();
		System.out.println("请您输入月份:");
		int month = sc.nextInt();
		System.out.println("请您输入日期:");
		int day = sc.nextInt();

		//构建指定的时间
		Date time = new Date(year - 1900, month - 1, day);

		//获取指定时间的毫秒数
		long millis = time.getTime();

		//获取当前系统时间的毫秒数
		long now = System.currentTimeMillis();

		//毫秒数相减取绝对值,然后转换成天数
		System.out.println("两个日期之间相隔:" + Math.abs(millis - now) / 1000 / 60 / 60 / 24 + "天");
	}
}
