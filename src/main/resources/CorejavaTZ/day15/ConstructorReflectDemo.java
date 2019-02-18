package com.corejava.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 本类用来演示Java反射技术获取构造方法,
 * 并且通过构造方法创建对象
 *
 * 作者:JSD1412
 * 时间:2015-1-23 下午1:51:31
 */
public class ConstructorReflectDemo {
	public static void main(String[] args) {
		Class<?> c = Point.class;

		try {
			//反射创建空参对象
			/*Constructor<?> constructor = c.getDeclaredConstructor(new Class<?>[]{});
			Point p = (Point) constructor.newInstance(new Object[]{});*/

			//反射创建有参对象
			/*Constructor<?> constructor = c
					.getDeclaredConstructor(new Class<?>[] { int.class,
							int.class });
			Point p = (Point) constructor.newInstance(new Object[] { 10, 20 });
			System.out.println(p);*/
			
			//注意:如果创建的是空对象,则可以使用如下操作简便方法:
			Point p = (Point) c.newInstance();
			System.out.println(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
