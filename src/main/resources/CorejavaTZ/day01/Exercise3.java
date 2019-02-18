package com.corejava.day01;

import java.util.Scanner;

/**
 * 本类用于演示无括号加减法
 */
public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入算式:");
		String str = sc.nextLine();
		String[] s = splitAdd(str);
		double result = 0;
		for (int i = 0; i < s.length; i++) {
			double res = 0;
			String[] n = splitSubtract(s[i]);
			res = sumSubtract(n);
			result += res;
		}
		System.out.println(result);
	}

	public static String[] splitAdd(String str) {
		String[] s = str.split("\\+");
		return s;
	}

	public static String[] splitSubtract(String s) {
		String[] n = s.split("\\-");
		return n;
	}

	public static double sumSubtract(String[] str) {
		double result = Double.parseDouble(str[0]);
		if (str.length > 1) {
			for (int i = 1; i < str.length; i++) {
				result -= Double.parseDouble(str[i]);
			}
		}
		return result;
	}
}
