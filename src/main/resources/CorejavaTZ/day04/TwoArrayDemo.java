package com.corejava.day04;

public class TwoArrayDemo {

	public static void main(String[] args) {
		//������ά����
		int[][] arr1 = new int[3][4];
		int[][] arr2 = new int[3][];
		int arr3[][] = new int[3][];

		//��ֵ
		//1.ͨ�����긳ֵ
		//arr1[2][3] = 8;

		//2.��ֵÿһ������
		//arr1[0] = new int[]{1,2,3,4};

		//3.������ά�����ͬʱֱ�Ӹ�ֵ
		int[][] arr4 = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 4, 2 },
				{ 8, 6, 3, 1 } };

		//����
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
