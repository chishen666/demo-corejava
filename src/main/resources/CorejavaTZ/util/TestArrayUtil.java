package com.corejava.util;

import java.util.Arrays;

public class TestArrayUtil {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 9, 4, 6, 6, 4, 2, 7 };
		arr = null;
		try {
			System.out.println(ArrayUtil.getMaxElement(arr));
		} catch (ArrayNotNullException e) {
			System.err.println("数组不能为空!");
		}
		//System.out.println(ArrayUtil.getMinElement(arr));

		//int[] temp = ArrayUtil.insertElement(arr, 4, 888);
		//System.out.println(Arrays.toString(temp));

		//System.out.println(Arrays.toString(ArrayUtil.sortMinToMax(arr)));
		//System.out.println(Arrays.toString(ArrayUtil.sortMaxToMin(arr)));

		//System.out.println(Arrays.toString(ArrayUtil.deleteElementByIndex(arr, 2)));

		//System.out.println(Arrays.toString(ArrayUtil.deleteElementByTarget(arr, 6)));

		//System.out.println(Arrays.toString(ArrayUtil.clearDoubleElement(arr)));
	}

}
