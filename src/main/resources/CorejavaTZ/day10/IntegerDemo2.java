package com.corejava.day10;

/**
 * 本类用来演示Java包装类的自动解封箱
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午2:51:23
 */
public class IntegerDemo2 {
	public static void main(String[] args) {

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true

		Integer i3 = 10;
		Integer i4 = 10;
		System.out.println(i3 == i4);//true
		System.out.println(i3.equals(i4));//true

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false
		System.out.println(i5.equals(i6));//true

		//注意:自动封箱底层其实调用的是valueOf()方法
		Integer i7 = Integer.valueOf(10);
		Integer i8 = Integer.valueOf(10);

		//结论:-128到127没有创建新对象,是从缓冲池中取值,而超过范围则创建新对象
	}
}
