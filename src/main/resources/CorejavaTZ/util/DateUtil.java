package com.corejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**���ڹ�����*/
public class DateUtil {

	/**
	 * ���������մ�������
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
	 * ����Date��ģ������ʽ��ʱ��	
	 */
	public static String formateDate(Date time, String pattern) {
		String formateStr = null;
		//�ǿ��ж�
		if (time != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			formateStr = sdf.format(time);
		}
		return formateStr;
	}

	/**
	 * ���������ַ����������ڵõ�Date
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
	 * ������,�»�ȡ��ǰ�µ��������
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
