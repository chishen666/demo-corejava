package com.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示Java参数传递
 *
 * 作者:JSD1412
 * 时间:2015-1-8 下午4:45:24
 */
public class TransformDemo {

	public static void main(String[] args) {
		/*int a = 10;
		add(a);
		System.out.println(a);//10*/
		
		int[] arr = {1,2,3};
		add(arr);
		System.out.println(Arrays.toString(arr));
	}

	//基本类型是值传递
	public static void add(int a) {
		++a;
	}
	
	//对象类型是引用传递
	public static void add(int[] a){
		for(int i = 0;i < a.length;i++){
			a[i] = a[i] + 1;
		}
	}
}
