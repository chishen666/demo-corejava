package com.corejava.day03.homework;

import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args) {
		//随机生成一个1~100之间的整数
		int randomNum = (int) (Math.random() * 100 + 1);
		System.out.println(randomNum);

		//定义范围起始和结束
		int start = 1;
		int end = 100;

		String message = null;//保存大小结果

		//定义变量保存状态,状态变量
		boolean bool = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t=====猜数字游戏=====\n\n");
		System.out.print("\t\t请输入你猜的数字(1~100):");
		int input = sc.nextInt();//用户猜测的数字

		for (int i = 1; i <= 5; i++) {
			if (input < start || input > end) {
				System.out.print("\t\t" + message + "请输入你猜的数字[" + start + "~"
						+ end + "]:");
				input = sc.nextInt();
				continue;
			}
			if (input < randomNum) {
				start = input;
				message = "太小了";
			} else if (input > randomNum) {
				end = input;
				message = "太大了";
			} else {
				System.out.println("\t\t哈哈哈,你中了.");
				System.out.println("\n\n\t\t生成的随机数是:" + randomNum + ",您一共猜测了["
						+ i + "]次.");
				bool = true;//改变状态变量的值
				break;
			}
			System.out.print("\t\t" + message + "请输入你猜的数字[" + start + "~" + end
					+ "]:");
			input = sc.nextInt();
			if(i == 5 && input == randomNum){
				System.out.println("\t\t哈哈哈,你中了.");
				System.out.println("\n\n\t\t生成的随机数是:" + randomNum + ",您一共猜测了["
						+ (i + 1) + "]次.");
				bool = true;//改变状态变量的值
			}
		}
		if (!bool) {
			System.out.println("\n\n\t\t对不起,您没有猜中,Game Over!");
		}
	}
}
