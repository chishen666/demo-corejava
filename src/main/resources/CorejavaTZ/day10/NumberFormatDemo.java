package com.corejava.day10;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 本类用来演示java.lang.NumberFormat
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午5:01:08
 */
public class NumberFormatDemo {
	public static void main(String[] args) {
		double d = 567556789.46565757;

		//1.创建数字格式化模板

		//获取当前系统环境下的默认数值格式
		//NumberFormat nf = NumberFormat.getInstance();
		
		//获取当前系统环境下的默认货币格式
		//NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		//获取指定国家的货币格式
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		
		//设置小数部分所允许的最大最小位数
		nf.setMaximumFractionDigits(5);
		nf.setMinimumFractionDigits(3);
		
		//设置整数部分所允许的最大最小位数
		nf.setMaximumIntegerDigits(10);//此方法注意数值范围
		nf.setMinimumIntegerDigits(5);
		
		//2.调用格式化方法
		String s = nf.format(d);
		System.out.println(s);
	}
}
