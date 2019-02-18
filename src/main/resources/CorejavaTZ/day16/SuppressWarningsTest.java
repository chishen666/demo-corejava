package com.corejava.day16;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 本类用来演示注解用来抑制警告信息
 *
 * 作者:JSD1412
 * 时间:2015-1-23 下午5:00:40
 */

//@SuppressWarnings({ "unused", "deprecation" ,"rawtypes","resource"})

@SuppressWarnings("all")
public class SuppressWarningsTest{
	
	//@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) {
		
		//定义变量却没有使用
		int i = 3;
		
		//集合定义没有泛型
		//@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		
		//调用了一个不推荐的使用方法
		new Date().getHours();
		
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
	}
}
