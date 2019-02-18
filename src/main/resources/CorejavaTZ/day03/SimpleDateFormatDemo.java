package com.corejava.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本类用来演示Java时间简单格式化
 *
 * 作者:JSD1412
 * 时间:2015-1-6 上午9:27:01
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		//获取系统时间
		Date now = new Date();
		System.out.println(now);
		
		//创建简单时间格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		//调用格式化方法
		String time = sdf.format(now);//把Date类型转换成String
		System.out.println(time);
		
		
		//解析日期字符串,传入的字符串必须 >= 时间模板(超出部分不会起作用)
		Date before = null;
		try {
			before = sdf.parse("2012/12/21 8:8:8");
		} catch (ParseException e) {
			//e.printStackTrace();
			System.err.println("解析失败!");
		}
		System.out.println(before);
	}
}
