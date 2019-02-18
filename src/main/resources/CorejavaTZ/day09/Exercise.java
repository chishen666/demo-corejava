package com.corejava.day09;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入账户:");
		String username = sc.nextLine();

		//1.Pattern类的matches("正则表达式","匹配的内容");
		if(Pattern.matches("[A-Z][A-Za-z0-9-]+", username)){

		//2.String类的matches("正则表达式");
		//if (username.matches("[A-Z][A-Za-z0-9-]+")) {
			System.out.println("请您输入密码:");
			String password = sc.nextLine();
			if (password.matches("\\d{6}")) {
				System.out.println("注册成功!");
			} else {
				System.out.println("密码不符合要求...");
			}
		} else {
			System.out.println("账号不符合要求...");
		}
	}
}
