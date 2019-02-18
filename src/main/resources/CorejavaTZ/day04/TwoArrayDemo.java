package com.corejava.day04;

public class TwoArrayDemo {

	public static void main(String[] args) {
		//创建二维数组
		int[][] arr1 = new int[3][4];
		int[][] arr2 = new int[3][];
		int arr3[][] = new int[3][];

		//赋值
		//1.通过坐标赋值
		//arr1[2][3] = 8;

		//2.赋值每一个数组
		//arr1[0] = new int[]{1,2,3,4};

		//3.创建二维数组的同时直接赋值
		int[][] arr4 = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 4, 2 },
				{ 8, 6, 3, 1 } };

		//遍历
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
