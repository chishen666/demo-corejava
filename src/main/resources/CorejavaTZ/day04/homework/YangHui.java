package com.corejava.day04.homework;

public class YangHui {
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(getNum(i, j) + "\t");
			}
			System.out.println();
		}
	}

	//�ݹ������������������������
	public static int getNum(int i, int j) {
		//�˳�����
		if (i == 1 || j == 1 || i == j) {
			return 1;
		}
		return getNum(i - 1, j - 1) + getNum(i - 1, j);
	}

}
