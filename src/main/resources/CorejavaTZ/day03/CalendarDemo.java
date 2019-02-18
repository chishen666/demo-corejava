package com.corejava.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 本类用来演示Java日历类
 *
 * 作者:JSD1412
 * 时间:2015-1-6 上午10:38:56
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//获取当前系统默认日历
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		//在中文环境下,创建语法等同于
		//Calendar cal = new GregorianCalendar();

		//get方法获取日历信息
		//获取星期几,范围1-7,默认星期天是1
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		//获取年份
		System.out.println(cal.get(Calendar.YEAR));

		//获取月份,范围是0~11,一月是0
		System.out.println(cal.get(Calendar.MONTH));

		//获取日期
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		//获取时
		System.out.println(cal.get(Calendar.HOUR));//12
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24

		//获取分钟
		System.out.println(cal.get(Calendar.MINUTE));

		//获取秒
		System.out.println(cal.get(Calendar.SECOND));

		//设置修改日历
		//通过常量修改日历某一个属性
		//cal.set(Calendar.YEAR, 2000);

		//一次性设置多个属性
		//cal.set(2012, 12 - 1, 21);
		cal.set(2012, 12 - 1, 21, 8, 8, 8);
		
		//通过日历获取系统时间
		Date time = cal.getTime();//把日历转换成日期,Calendar -> Date
		System.out.println(time);
	}
}
