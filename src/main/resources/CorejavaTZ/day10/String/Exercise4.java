package com.corejava.day10.String;

import com.corejava.util.InputUtil;

public class Exercise4 {
	public static void main(String[] args) {
		String username = InputUtil.inputLine("���������û���:");
		String result = String.valueOf(username.charAt(0));
		for (int i = 0; i < username.length() - 1; i++) {
			result += "*";
		}
		System.out.println("������Ϊ:" + result);
	}
}
