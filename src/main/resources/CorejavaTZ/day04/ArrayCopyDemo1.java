package com.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示Java数组元素的增删
 *
 * 作者:JSD1412
 * 时间:2015-1-8 下午2:34:03
 */
public class ArrayCopyDemo1 {
	public static void main(String[] args) {

		int[] arr = { 1, 6, 8, 3 };

		/*	//1.先定义一个三个长度的新数组容器
			int[] temp = new int[arr.length - 1];
			//2.把原数组中1,6拷贝到新数组的第一个和第二个位置
			System.arraycopy(arr, 0, temp, 0, 2);
			//3.把原数组中3拷贝到新数组的最后一个位置
			System.arraycopy(arr, 3, temp, 2, 1);
			System.out.println(Arrays.toString(temp));*/

		//1和6中间加一个8
		int[] temp = new int[arr.length + 1];
		System.arraycopy(arr, 0, temp, 0, 1);
		System.arraycopy(arr, 1, temp, 2, 3);
		temp[1] = 8;
		System.out.println(Arrays.toString(temp));
	}
}
