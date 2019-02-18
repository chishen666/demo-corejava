package com.corejava.day15;

import java.lang.reflect.Method;

/**
 * 本类用来演示利用Java反射技术获取方法并且调用
 *
 * 作者:JSD1412
 * 时间:2015-1-23 下午2:32:16
 */
public class MethodReflectDemo {
	public static void main(String[] args) {
		Class<?> c = Point.class;

		try {
			//反射创建对象
			Point p = (Point) c.newInstance();

			//1.调用void类型空参方法
			Method m1 = c.getDeclaredMethod("doSomething", new Class<?>[] {});
			//反射调用方法
			m1.invoke(p, new Object[] {});

			//2.调用void类型的有参方法
			Method m2 = c.getDeclaredMethod("doSomething", new Class<?>[] {
					int.class, String.class });
			m2.invoke(p, new Object[] { 10, "Tom" });

			//3.调用静态方法
			Method m3 = c.getDeclaredMethod("method", new Class<?>[] {});
			m3.invoke(null, new Object[] {});

			//4.调用返回类型不是void的方法
			Method m4 = c
					.getDeclaredMethod("doReturnMethod", new Class<?>[] {});
			String result = (String) m4.invoke(p, new Object[] {});
			System.out.println(result);

			//5.调用私有化的方法
			Method m5 = c.getDeclaredMethod("doMethod", new Class<?>[] {});
			
			//调用私有方法前设置返回类型
			m5.setAccessible(true);
			
			m5.invoke(p, new Object[] {});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
