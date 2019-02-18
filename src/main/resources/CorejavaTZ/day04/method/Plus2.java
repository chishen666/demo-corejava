package com.corejava.day04.method;

import java.util.Scanner;

public class Plus2 {
	/*public static void main(String[] args) {
		//如果调用的方法是static的,则可以直接用类名.方法名调用
		Plus2.add();
		
		//如果被调用的静态方法在自己内部,则直接方法名就可以调用
		add();
	}*/
	
	//自定义加法(静态方法)
	public static void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入第一个数字:");
		int i = sc.nextInt();
		System.out.println("请您输入第二个数字:");
		int j = sc.nextInt();
		System.out.println("计算结果为:" + (i + j));
	}
}
