package com.corejava.day03;

import java.util.Date;

/**
 * 本类用来演示Java日期类
 *
 * 作者:JSD1412
 * 时间:2015-1-5 下午4:09:25
 */
public class DateDemo {
	public static void main(String[] args) {
		//获取当前系统时间
		Date now = new Date();
		System.out.println(now);

		//过时的方法,不推荐使用,但是功能还是可以使用的
		System.out.println(now.getYear());

		//把时间设置到指定位置,月份0~11,星期1-7,星期天是1
		Date time = new Date(2014 - 1900, 1 - 1, 5, 8, 8, 8);
		System.out.println(time);
		
		//判断日期是否在给定日期之前
		System.out.println(now.before(time));
		
		//判断日期是否在给定日期之后
		System.out.println(now.after(time));
		
		
		//对时间进行运算 -- 把时间转换成毫秒进行加减运算
		
		//1.System.currentTimeMillies();
		//获取当前系统时间的毫秒数
		long l1 = System.currentTimeMillis();//此方法经常作为性能检测使用
		System.out.println(l1);
		
		//2.getTime()方法
		long l2 = time.getTime();
		System.out.println(l2);
		
		
		//把毫秒数转换成时间
		//1.
		Date date = new Date(l2);
		System.out.println(date);
		
		//2.
		time.setTime(l2);
		System.out.println(time);
	}
}
