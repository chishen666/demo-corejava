package com.corejava.day15;

import java.lang.reflect.Array;

/**
 * 本类用来演示Java反射技术操作数组
 *
 * 作者:JSD1412
 * 时间:2015-1-23 下午4:00:02
 */
public class ArrayReflectDemo {
	public static void main(String[] args) {
		/*//反射创建数组
		int[] arr = (int[]) Array.newInstance(int.class, 5);
		
		//通过下标赋值/修改数组元素
		Array.set(arr, 0, 10);
		
		//通过下标获取数组元素
		System.out.println(Array.get(arr, 0));*/

		int[] intArr = { 1, 2, 3 };
		long[] longArr = { 10L, 20L, 30L, 40L };
		String[] names = { "Jack", "Rose", "LiLei" };

		intArr = (int[]) extend(intArr);
		longArr = (long[]) extend(longArr);
		names = (String[]) extend(names);

		printArray(intArr);
		printArray(longArr);
		printArray(names);

		System.out.println("-------------------");

		//创建多维数组
		int[][][][] arr1 = (int[][][][]) Array.newInstance(int.class, 3, 5, 7, 8);
		
		String[][] arr2 = (String[][]) Array.newInstance(String.class, 3, 3);
	}

	/**
	 * 写一个方法遍历任何数组
	 */
	public static void printArray(Object arr) {
		//反射获取arr数组的长度
		int length = Array.getLength(arr);

		for (int i = 0; i < length; i++) {
			System.out.println(Array.get(arr, i));
		}
		System.out.println("----------------");
	}

	/**
	 * 扩容原数组,长度X2
	 */
	public static Object extend(Object arr) {
		//获取原数组的长度,并且计算新长度
		int newLength = Array.getLength(arr) * 2;

		//获取数组的组件类型
		Class<?> type = arr.getClass().getComponentType();

		//反射创建新数组
		Object temp = Array.newInstance(type, newLength);

		//把原数组中的元素复制到新数组中
		for (int i = 0; i < Array.getLength(arr); i++) {
			Array.set(temp, i, Array.get(arr, i));
		}
		return temp;
	}
}
