package com.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示Java数组的排序
 *
 * 作者:JSD1412
 * 时间:2015-1-8 下午3:50:53
 */
public class ArraySortDemo {
	
	public static void main(String[] args) {
		int[] arr = {345,568,6,978,4,2135,3};
		
		//API自带排序方法,只能从小到大
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	//自定义排序方法
	public static int[] sortMinToMax(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					//定义变量保存原值
					int temp = arr[i];
					//交换位置
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
