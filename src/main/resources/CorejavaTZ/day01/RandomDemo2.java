package com.corejava.day01;

//2.导入
import java.util.Random;

/**
 * 本类用来演示Java产生随机数的两种方式
 * 
 * java.util.Random类
 *
 * 作者:JSD1412
 * 时间:2015-1-4 下午1:43:23
 */
public class RandomDemo2 {
	public static void main(String[] args) {
		
		//1.创建随机数对象
		Random rd = new Random();
		
		//3.通过对象调用方法
		int i = rd.nextInt();//获取int范围内的随机整数
		
		double d = rd.nextDouble();//获取随机浮点数
		
		System.out.println(i);
		System.out.println(d);
		
		//改变范围
		int i2 = rd.nextInt(10);//产生[0,10)的随机整数
		System.out.println(i2);
	}
}
