package com.corejava.day10.String;

import com.corejava.util.InputUtil;

public class Exercise3 {
	public static void main(String[] args) {
		String phone = InputUtil.inputLine("请您输入手机号码:");
		String result = new StringBuilder(phone).replace(3, 7, "****")
				.toString();
		System.out.println("处理结果为:" + result);
	}
}
