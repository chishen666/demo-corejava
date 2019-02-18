package com.corejava.day10;

/**
 * 本类用来演示Java包装类
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午2:35:12
 */
public class IntegerDemo1 {
	public static void main(String[] args) {

		//常用属性

		//*获取运行时类型
		Class<?> c1 = Integer.TYPE;
		System.out.println(c1);

		//32比特位位
		//System.out.println(Integer.SIZE);

		//*获取int范围最值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		//根据指定的整数值来构建一个Integer对象
		Integer i1 = new Integer(10);//把基本类型转换成包装类
		System.out.println(i1);

		//根据指定的字符串来构建一个Integer对象
		//把纯数字字符串转换成包装类,否则抛出异常:java.lang.NumberFormatException
		Integer i2 = new Integer("10");
		System.out.println(i2);

		//JDK5.0之后提供了一种全新的技术 -- 自动解封箱,基本类型和包装类型的直接互转
		Integer i3 = 10;//自动封箱,把基本类型转换成包装类
		int i4 = i3;//自动解箱,把包装类转换成基本类型

		//注意:自动封箱详解见IntegerDemo2.java

		//常用方法

		//把字符串转换成包装类
		Integer i5 = Integer.decode("123");

		//把包装类转换成基本类型
		int i6 = i1.intValue();

		//把字符串转换成基本类型
		int i7 = Integer.parseInt("123");

		//把整数转换成对应的进制数
		String binary = Integer.toBinaryString(10);
		String octal = Integer.toOctalString(10);
		String hex = Integer.toHexString(10);

		//把基本类型或者字符串转换成包装类
		Integer i8 = Integer.valueOf(10);
		Integer i9 = Integer.valueOf("10");
	}
}
