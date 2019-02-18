package com.corejava.day03.homework;

import java.util.Scanner;

public class GameRandomNum3 {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 100 + 1);

		System.out.println(num1);

		Scanner sc = new Scanner(System.in);


		int big = 100, small = 1;

		//System.out.println("请输入你猜的数字1-100:");

		for (int i = 0; i < 6; i++) {
			System.out.println("请输入你猜的数字" + small + "-" + big);
			int num2 = sc.nextInt();

			if (num2 > num1 && num2 <= big) {
				System.out.print("太大了！");
				big = num2;
				//System.out.println("请输入你猜的数字" + small + "-" + big);

			} else if (num2 < num1 && num2 >= small) {
				System.out.print("太小了！");
				small = num2;
				//System.out.println("请输入你猜的数字" + small + "-" + big);

			} else if (num1 == num2) {
				System.out.println("恭喜你，猜对了！");
				System.out.println("你一共猜了" + (i + 1) + "次！");
				break;
			} else {
				System.out.println("对不起，你猜的数不合法！");
				break;
			}
		}

	}

}
