package com.corejava.day09.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	private static String content;

	//静态代码块初始化静态属性
	static {
		content = "The Associated Press won an award for its series on "
				+ "the profiling of Muslims by the New York Police "
				+ "Department.But for the first time since 1977 there was"
				+ " no prize for fiction.The Pulitzer panel praised the "
				+ "Patriot-News.";
	}

	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("[0-9]+");
		Matcher m1 = p1.matcher(content);
		while (m1.find()) {
			System.out.println(m1.group());
		}

		System.out.println("----------------------");

		Pattern p2 = Pattern.compile("[A-Za-z-]+");
		Matcher m2 = p2.matcher(content);
		int count = 0;
		while (m2.find()) {
			count++;
			System.out.println(m2.group());
		}
		System.out.println("文中共有单词:" + count + "个.");
	}
}
