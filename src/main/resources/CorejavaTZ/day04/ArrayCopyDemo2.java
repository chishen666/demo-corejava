package com.corejava.day04;

import java.util.Arrays;

/**
 * ����������ʾJava����Ԫ�ص���ɾ
 *
 * ����:JSD1412
 * ʱ��:2015-1-8 ����2:34:03
 */
public class ArrayCopyDemo2 {
	public static void main(String[] args) {

		int[] arr = { 1, 6, 8, 3 };

		int[] temp = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(temp));

	}
}
