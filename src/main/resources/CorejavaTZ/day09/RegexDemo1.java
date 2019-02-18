package com.corejava.day09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 本类用来演示Java正则表达式API的使用
 *
 * 作者:JSD1412
 * 时间:2015-1-15 上午9:14:07
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		//1.根据正则表达式创建匹配模板
		//首字母大写,后面由数字大小写字母组成,并且长度大于等于6位
		Pattern p = Pattern.compile("[A-Z][A-Za-z0-9]{5,}");

		//6位数字密码
		//Pattern p = Pattern.compile("[0-9]{6}");
		//Pattern p = Pattern.compile("\\d{6}");

		//2.根据模板创建匹配器
		Matcher m = p.matcher("JavaScript");

		//3.精确匹配
		boolean bool = m.matches();
		System.out.println(bool == true ? "匹配成功!" : "匹配失败!");

		System.out
				.println(Pattern.matches("[A-Z][A-Za-z0-9]{5,}", "JavaScript") == true ? "匹配成功!"
						: "匹配失败!");

	}
}
