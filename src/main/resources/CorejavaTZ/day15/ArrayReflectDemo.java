package com.corejava.day15;

import java.lang.reflect.Array;

/**
 * ����������ʾJava���似����������
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����4:00:02
 */
public class ArrayReflectDemo {
	public static void main(String[] args) {
		/*//���䴴������
		int[] arr = (int[]) Array.newInstance(int.class, 5);
		
		//ͨ���±긳ֵ/�޸�����Ԫ��
		Array.set(arr, 0, 10);
		
		//ͨ���±��ȡ����Ԫ��
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

		//������ά����
		int[][][][] arr1 = (int[][][][]) Array.newInstance(int.class, 3, 5, 7, 8);
		
		String[][] arr2 = (String[][]) Array.newInstance(String.class, 3, 3);
	}

	/**
	 * дһ�����������κ�����
	 */
	public static void printArray(Object arr) {
		//�����ȡarr����ĳ���
		int length = Array.getLength(arr);

		for (int i = 0; i < length; i++) {
			System.out.println(Array.get(arr, i));
		}
		System.out.println("----------------");
	}

	/**
	 * ����ԭ����,����X2
	 */
	public static Object extend(Object arr) {
		//��ȡԭ����ĳ���,���Ҽ����³���
		int newLength = Array.getLength(arr) * 2;

		//��ȡ������������
		Class<?> type = arr.getClass().getComponentType();

		//���䴴��������
		Object temp = Array.newInstance(type, newLength);

		//��ԭ�����е�Ԫ�ظ��Ƶ���������
		for (int i = 0; i < Array.getLength(arr); i++) {
			Array.set(temp, i, Array.get(arr, i));
		}
		return temp;
	}
}
