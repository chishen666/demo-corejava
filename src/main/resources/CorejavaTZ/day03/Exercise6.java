package com.corejava.day03;

public class Exercise6 {

	public static void main(String[] args) {

		//打印一个矩形边框,
		/*
			*****************
			*				*
			*				*
			*				*
			*				*
			*****************
		*/
		/*for (int i = 0; i < 5; i++) {//行
			for (int j = 0; j < 15; j++) {//列
				if (i == 0 || i == 4 || j == 0 || j == 14) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			//内层运行完毕后换行
			System.out.println();
		}*/

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 7 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= i; j--) {
				if (i == 1 || j == i || j == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		//打印一个99乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

		/* 
		 1*8+1= 9
		 12*8+2= 98
		 123*8+3= 987
		 1234*8+4= 9876
		 12345*8+5= 98765
		 123456*8+6= 987654
		 1234567*8+7= 9876543
		 12345678*8+8= 98765432
		 123456789*8+9= 987654321
		 */
		/*int num = 1;
		int base = 8;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + base + "+" + i + "="
					+ (num * base + i));
			num *= 10;
			num += i + 1;
		}*/

		/*
		 1*9+2= 11
		 12*9+3= 111
		 123*9+4= 1111
		 1234*9+5= 11111
		 12345*9+6= 111111
		 123456*9+7= 1111111
		 1234567*9+8= 11111111
		 12345678*9+9= 111111111
		 123456789*9+10= 1111111111
		 */
		int num = 1, base = 9;
		for (int i = 2; i <= 10; i++) {
			System.out.println(num + "*" + base + "+" + i + "="
					+ (num * base + i));
			num *= 10;
			num += i;
		}
	}
}
