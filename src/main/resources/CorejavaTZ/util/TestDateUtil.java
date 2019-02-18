package com.corejava.util;

import java.util.Date;

public class TestDateUtil {
	public static void main(String[] args) {
		int year = InputUtil.inputInt("请您输入年份:");
		int month = InputUtil.inputInt("请您输入月份:");
		int day = InputUtil.inputInt("请您输入日期:");
		Date birthday = DateUtil.createDate(year, month, day);
		System.out.println(birthday);

		Date date = new Date();
		String time = DateUtil.formateDate(date, "yyyy-MM-dd");
		System.out.println(time);
		
		Date d = DateUtil.parseDate("2015-12-2", "yyyy-MM-dd");
		System.out.println(d);
		
		System.out.println(DateUtil.getMaxDays(2015, 9));
	}

}
