package com.corejava.day04;

import java.util.Arrays;

/**
 * ����������ʾJava����Ԫ�ص���ɾ
 *
 * ����:JSD1412
 * ʱ��:2015-1-8 ����2:34:03
 */
public class ArrayCopyDemo1 {
	public static void main(String[] args) {

		int[] arr = { 1, 6, 8, 3 };

		/*	//1.�ȶ���һ���������ȵ�����������
			int[] temp = new int[arr.length - 1];
			//2.��ԭ������1,6������������ĵ�һ���͵ڶ���λ��
			System.arraycopy(arr, 0, temp, 0, 2);
			//3.��ԭ������3����������������һ��λ��
			System.arraycopy(arr, 3, temp, 2, 1);
			System.out.println(Arrays.toString(temp));*/

		//1��6�м��һ��8
		int[] temp = new int[arr.length + 1];
		System.arraycopy(arr, 0, temp, 0, 1);
		System.arraycopy(arr, 1, temp, 2, 3);
		temp[1] = 8;
		System.out.println(Arrays.toString(temp));
	}
}
