package com.carrx.corejava.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// try {
		// int result = divide(1, 0);
		// System.out.println(result);
		// } catch (Exception e) {
		// e.printStackTrace();
		// System.out.println(e);
		// System.out.println(e.getMessage());
		// System.out.println(e.getLocalizedMessage());
		// }
		try {
			test(3, 3);
			test(4, 3);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	private static void test(int a, int b) throws MyException {
		if (a > b) {
			throw new MyException("我的异常");
		} else {
			throw new NullPointerException();
		}
	}
}
