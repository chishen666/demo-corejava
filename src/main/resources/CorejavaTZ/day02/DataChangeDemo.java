package com.corejava.day02;

/**
 * 
 * 本类用来演示Java数据类型的转换
 *
 * 作者:JSD1412
 * 时间:2015-1-5 上午9:37:57
 */
public class DataChangeDemo {
	public static void main(String[] args) {
		//1.自动类型转换(隐式类型转换)
		double d = 3;
		System.out.println(d);

		//2.强制类型转换
		float f = (float) 3.14;//没有损失精度
		System.out.println(f);

		int i = (int) 3.94;
		System.out.println(i);//损失精度

		//特殊强制类型转换方法
		double d1 = 3D;
		double d2 = 3d;

		float f1 = 3.14F;
		float f2 = 3.14f;

		long l1 = 100L;
		long l2 = 100l;

		//Java中两种数据类型进行运算,结果是偏向数据类型较大的一方!

		System.out.println(9 / 2);
		System.out.println(9.0 / 2);
		System.out.println(9 / 2.0);
		System.out.println(9.0 / 2.0);

		//字符串与某些数据类型进行运算,结果是String
		System.out.println(3 + 3);
		System.out.println(3 + "3");
		System.out.println("3" + 3);
		System.out.println("3" + "3");
	}
}
