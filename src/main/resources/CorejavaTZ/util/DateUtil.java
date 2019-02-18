package com.corejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**日期工具类*/
public class DateUtil {

	/**
	 * 根据年月日创建日期
	 */
	public static Date createDate(int year, int month, int day) {
		Date time = null;
		if (year >= 0 && month > 0 && month < 13 && day > 0 && day < 32) {
			Calendar cal = Calendar.getInstance();
			cal.set(year, month - 1, day);
			time = cal.getTime();
		}
		return time;
	}

	/**
	 * 根据Date和模板来格式化时间	
	 */
	public static String formateDate(Date time, String pattern) {
		String formateStr = null;
		//非空判断
		if (time != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			formateStr = sdf.format(time);
		}
		return formateStr;
	}

	/**
	 * 根据日期字符串解析日期得到Date
	 */
	public static Date parseDate(String time, String pattern) {
		Date date = null;
		if (time != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			try {
				date = sdf.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}

	/**
	 * 根据年,月获取当前月的最大天数
	 */
	public static int getMaxDays(int year, int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (new GregorianCalendar().isLeapYear(year)) {
				return 29;
			}
			return 28;
		default:
			return 0;
		}
	}
}
