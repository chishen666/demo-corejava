package com.corejava.day01;

//2.导入
import java.util.Scanner;

/**
 * 本类用来演示Java获取用户键盘输入
 *
 * 作者:JSD1412
 * 时间:2015-1-4 下午2:14:50
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//1.创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入内容:");
		//3.获取用户键盘输入
		//阻塞方法,等待用户的输入

		//int r = sc.nextInt();
		//double r = sc.nextDouble();

		String r = sc.nextLine();//获取用户输入的任意信息

		System.out.println("您刚才输入的是:" + r);
	}
}
