package com.corejava.day09;

/**
 * 本类用来演示Java异常处理的方式
 * 1.积极处理
 * 2.消极处理
 * 
 * 积极处理是指在触发异常的代码上直接使用try catch进行捕获并且处理
 * 消极处理是指把异常抛出给方法,并且由调用者来处理异常的方式,也就是
 * 说消极处理不是不处理,而是把处理异常的时机延后而已,由调用者来决定
 * 是否处理,调用者可以直接积极处理掉,当然也可以继续消极处理,当然,如果
 * 异常最后抛给了main()方法,则必须在main中积极处理,否则一旦出现异常,
 * 无法修复.
 *
 * 作者:JSD1412
 * 时间:2015-1-15 下午1:42:42
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		//method1();

		try {
			method2();
		} catch (NullPointerException e) {
			System.out.println("数组为空!");
		}
	}

	//积极处理异常
	public static void method1() {
		int[] arr = { 2, 6, 7, 9, 3, 5, 7, 9 };

		int result = 0;

		try {
			result = arr[10];
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException e) {
			//异常处理代码
			//e.printStackTrace();//打印异常错误的堆栈信息
			System.out.println("数组下标越界!");

			result = arr[2];
			System.out.println(result);
		}
	}

	//消极处理
	public static void method2() throws NullPointerException,ArrayIndexOutOfBoundsException{
		int[] arr = {1,2,3};
		int result = arr[0];
		System.out.println(result);
		//throw new NullPointerException();
	}

	//如何选择处理方式?
	public static void A() throws InterruptedException {
		Thread.sleep(1000);
	}

	public static void B() {
		//在B方法中一次性捕获同一个异常
		try {
			Thread.sleep(1000);
			A();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
