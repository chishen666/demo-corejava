package com.corejava.day01.homework;

//2.导入
import java.util.Scanner;

public class HalfPrice {

	public static void main(String[] args) {
		//定义单价
		double price = 10.0;
		
		//输入购买数量

		//1.创建Scanner对象
		Scanner sc = new Scanner(System.in);

		//3.调用方法
		System.out.println("请您输入购买数量:");
		int count = sc.nextInt();

		//计算偶数杯的价格
		double total = count / 2 * price + count / 2 * (price / 2);

		//判断count是技术还是偶数
		if (count % 2 != 0) {
			total += price;
		}
		System.out.println("您一共需要花费:" + total);

	}
}
