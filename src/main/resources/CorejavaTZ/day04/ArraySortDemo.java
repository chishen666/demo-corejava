package com.corejava.day04;

import java.util.Arrays;

/**
 * ����������ʾJava���������
 *
 * ����:JSD1412
 * ʱ��:2015-1-8 ����3:50:53
 */
public class ArraySortDemo {
	
	public static void main(String[] args) {
		int[] arr = {345,568,6,978,4,2135,3};
		
		//API�Դ����򷽷�,ֻ�ܴ�С����
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	//�Զ������򷽷�
	public static int[] sortMinToMax(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					//�����������ԭֵ
					int temp = arr[i];
					//����λ��
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
