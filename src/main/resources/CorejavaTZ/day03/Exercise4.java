package com.corejava.day03;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercise4 {

	/**
	 * 练习:输入年份,获取该年是闰年还是平年
	 * 
	 * 年份可以整除4但是不能整除100,或者年份可以直接整除400,就是闰年
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			System.out.println("请您输入年份:");
			int year = sc.nextInt();
	
			//1.
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + "年是闰年.");
			} else {
				System.out.println(year + "年是平年.");
			}
		}

		//2.
		/*if (new GregorianCalendar().isLeapYear(year)) {
			System.out.println(year + "年是闰年.");
		} else {
			System.out.println(year + "年是平年.");
		}*/
	}
}
