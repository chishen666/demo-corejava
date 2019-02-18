package com.corejava.day03.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProductCalc {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		System.out.println("请您输入年份:");
		int year = sc.nextInt();
		System.out.println("请您输入月份:");
		int month = sc.nextInt();
		System.out.println("请您输入日期:");
		int day = sc.nextInt();

		//构建指定的时间
		Date time = new Date(year - 1900, month - 1, day);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入生产日期(yyyy-MM-dd):");
		String createStr = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date createDate = sdf.parse(createStr);
			
			System.out.println("请您输入保质期:");
			int days = sc.nextInt();

			long l = createDate.getTime() + 1000L * 60 * 60 * 24 * days;

			createDate.setTime(l);

			System.out.println(createDate.before(new Date()) ? "过期" : "未过期");
			
		} catch (ParseException e) {
			//e.printStackTrace();
			System.err.println("对不起,您的输入有误!");
		}
	}
}
