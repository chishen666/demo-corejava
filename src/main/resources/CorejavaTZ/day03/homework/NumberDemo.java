package com.corejava.day03.homework;

public class NumberDemo {
	public static void main(String[] args) {
		int base = 9, num = 9;

		for (int i = 7; i >= 0; i--) {
			System.out.println(num + "*" + base + "+" + i + "="
					+ (num * base + i));
			num *= 10;
			num += i + 1;
		}
	}
}
