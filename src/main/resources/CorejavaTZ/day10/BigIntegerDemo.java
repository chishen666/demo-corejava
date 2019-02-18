package com.corejava.day10;

import java.math.BigInteger;

/**
 * ����������ʾJava����������
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����4:45:31
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		System.out.println(fac(1000));
	}

	public static BigInteger fac(int num) {

		//ת���ɴ���������
		BigInteger bi = new BigInteger(num + "");

		if (num == 1) {
			return BigInteger.ONE;
		}
		return bi.multiply(fac(num - 1));
	}
}
