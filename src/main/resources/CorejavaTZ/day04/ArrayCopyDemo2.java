package com.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示Java数组元素的增删
 *
 * 作者:JSD1412
 * 时间:2015-1-8 下午2:34:03
 */
public class ArrayCopyDemo2 {
	public static void main(String[] args) {

		int[] arr = { 1, 6, 8, 3 };

		int[] temp = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(temp));

	}
}
