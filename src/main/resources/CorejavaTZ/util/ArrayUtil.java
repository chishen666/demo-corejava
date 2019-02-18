package com.corejava.util;

import java.util.Arrays;

/**
 * 本类用来演示Java数组的常见操作
 *
 * 作者:JSD1412
 * 时间:2015-1-8 上午11:08:35
 */
public class ArrayUtil {

	/**
	 * 找出数组中最大的元素
	 * @throws ArrayNotNullException 
	 */
	public static int getMaxElement(int[] arr) throws ArrayNotNullException {
		//非空判断
		if (arr == null) {
			throw new ArrayNotNullException();
		}
		//假设第一个元素是最大值
		int max = arr[0];
		//从第二个元素开始依次循环与其比较
		for (int i = 1; i < arr.length; i++) {
			//如果后面元素比max还大,则覆盖max
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * 找出数组中最小的元素
	 */
	public static int getMinElement(int[] arr) {
		//非空判断
		if (arr != null) {
			//假设第一个元素是最小值
			int min = arr[0];
			//从第二个元素开始依次循环与其比较
			for (int i = 1; i < arr.length; i++) {
				//如果后面元素比min还小的,则覆盖min
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
		return 0;
	}

	/**
	 * 在数组指定位置添加指定值
	 */
	public static int[] insertElement(int[] src, int index, int value) {
		//非空判断
		if (src == null) {
			return null;
		}
		//下标不合法,直接返回原数组
		if (index < 0 || index > src.length - 1) {
			return src;
		}
		//创建新容器,长度为原容器+1
		int[] temp = new int[src.length + 1];

		//分段
		//index之前,一对一相同位置赋值
		for (int i = 0; i < index; i++) {
			temp[i] = src[i];
		}
		//index处
		temp[index] = value;

		//index之后
		for (int i = index; i < src.length; i++) {
			temp[i + 1] = src[i];
		}
		return temp;
	}

	/**
	 * 从小到大排列数组元素
	 */
	public static int[] sortMinToMax(int[] arr) {
		if (arr == null) {
			return null;
		}
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

	/**
	 * 从大到小排列数组元素
	 */
	public static int[] sortMaxToMin(int[] arr) {
		if (arr == null) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
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

	/**
	 * 根据下标删除数组元素
	 */
	public static int[] deleteElementByIndex(int[] arr, int index) {
		if (arr == null) {
			return null;
		}
		if (index < 0 || index >= arr.length) {
			return arr;
		}
		//此处说明数组一定可以删除一个元素
		int[] temp = new int[arr.length - 1];
		//定义新数组的下标
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				temp[idx++] = arr[i];
			}
		}
		return temp;
	}

	/**
	 * 根据元素删除元素
	 */
	public static int[] deleteElementByTarget(int[] arr, int element) {
		if (arr == null) {
			return null;
		}
		//判断数组中有几个element
		int count = 0;//计数器
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		//新建数组,长度为原长度-count
		int[] temp = new int[arr.length - count];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				temp[idx++] = arr[i];
			}
		}
		return temp;
	}

	/**
	 * 去除数组中的重复元素
	 */
	public static int[] clearDoubleElement(int[] arr) {
		//新建数组容量和原数组相同
		int[] temp = new int[arr.length];
		int idx = 0;
		for (;;) {
			temp[idx++] = arr[0];
			arr = deleteElementByTarget(arr, arr[0]);
			//数组长度如果为0,说明元素都已经删除,则退出循环
			if (arr.length == 0) {
				break;
			}
		}
		temp = Arrays.copyOf(temp, idx);
		return temp;
	}
}
