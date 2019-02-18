package com.corejava.day10.homework;

public class StringTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is a log file,it was store at")
				.append("\"d:\\Program File\\temp\" ")
				.append("directory.the format of log file was:\n")
				.append("20130509:Jack:M:1990-08-08");

		//1.截取此内容中的路径子字符串
		//获取字符串中第一个"出现的下标
		int start = builder.indexOf("\"");
		//获取字符串中第二个"出现的下标
		int end = builder.indexOf("\"", start + 1);
		//截取路径
		String path = builder.substring(start + 1, end);
		System.out.println(path);

		//2.把第一个引号之前的部分中的所有空格替换为#
		String beforePart = builder.substring(0, start).replace(" ", "#");
		System.out.println(beforePart);

		//把第二个引号之后的部分中的所有空格替换为*
		String afterPart = builder.substring(end + 1).replace(" ", "*");
		System.out.println(afterPart);

		//3.把\n后面的字符串取出打印
		String lastPart = builder.substring(builder.indexOf("\n") + 1);
		System.out.println(lastPart);

		//以:作为切割符,把\n后面截取出来的字符串分段打印
		String[] arr = lastPart.split(":");

		for (String s : arr) {
			System.out.println(s);
		}
	}
}
