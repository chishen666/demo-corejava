package com.corejava.day09;

/**
 * 本类用来演示Java异常的使用
 *
 * 作者:JSD1412
 * 时间:2015-1-15 下午2:40:28
 */
public class DivideDemo {

	public static void main(String[] args) {
		Double d1 = 9.0;
		Double d2 = 0.0;
		try {
			System.out.println(divide(d1, d2));
		} catch (NullPointerException e) {
			System.out.println("除数或者被除数不能为空!");
			//...
		} catch (DivideNotZeroException e) {
			System.out.println("除数不能为0!");
			//...
		}
	}

	public static double divide(Double d1, Double d2)
			throws NullPointerException, DivideNotZeroException {

		//非空判断
		if (d1 == null || d2 == null) {
			//抛出异常
			throw new NullPointerException("除数或者被除数不能为空!");
		}

		//判断除数是否为0
		if (d2 == 0) {
			throw new DivideNotZeroException("除数不能为0!");
		}
		return d1 / d2;
	}
}
