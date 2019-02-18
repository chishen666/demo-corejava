package com.corejava.day10;

import java.math.BigInteger;

/**
 * 本类用来演示Java大数字类型
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午4:45:31
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		System.out.println(fac(1000));
	}

	public static BigInteger fac(int num) {

		//转换成大数字类型
		BigInteger bi = new BigInteger(num + "");

		if (num == 1) {
			return BigInteger.ONE;
		}
		return bi.multiply(fac(num - 1));
	}
}
