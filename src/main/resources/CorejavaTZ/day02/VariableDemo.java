package com.corejava.day02;

/**
 * 本类用来演示Java变量的定义
 *
 * 作者:JSD1412
 * 时间:2015-1-5 上午10:40:45
 */
public class VariableDemo {
	public static void main(String[] args) {
		//1.字面量赋值
		// 字面量就是指数据本身,3,3.14,"张三"

		//创建变量的同时直接赋值
		int i = 3; //把字面量3赋值给int数据类型的变量i
		String s = "张三";

		//先创建变量,然后再赋值
		int j;
		j = 3;

		// 注意:初始化--创建变量后第一次赋值

		//2.通过方法赋值
		int z = Math.max(3, 4);

		//3.通过表达式赋值
		//  表达式就是由变量和运算符所组成的合法的语句
		int a = 3;
		int b = 4;
		int r = a + b;

		//4.特殊赋值方式
		int a1, b1, c1;
		a1 = b1 = c1 = 1;//链式赋值

		int a2 = 3, b2 = 4, c2 = 5;
		
		//定义常量
		final int ROW_EACH_PAGE = 10;

		//ROW_EACH_PAGE = 20;//常量一旦确定,无法改变
		
	}
}
