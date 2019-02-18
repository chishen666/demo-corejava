package com.corejava.day03;

import java.util.Scanner;

/**
 * 本类用来演示Switch case
 *
 * 作者:JSD1412
 * 时间:2015-1-6 下午2:10:33
 */
public class SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("功能1");
			break;//打断当前switch
		case 2:
			System.out.println("功能2");
			break;
		case 3:
			System.out.println("功能3");
			break;
		case 4:
			System.out.println("功能4");
			break;
		default:
			System.out.println("暂无功能...");
		}
	}
}
