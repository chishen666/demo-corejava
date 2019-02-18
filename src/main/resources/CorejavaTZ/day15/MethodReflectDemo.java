package com.corejava.day15;

import java.lang.reflect.Method;

/**
 * ����������ʾ����Java���似����ȡ�������ҵ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����2:32:16
 */
public class MethodReflectDemo {
	public static void main(String[] args) {
		Class<?> c = Point.class;

		try {
			//���䴴������
			Point p = (Point) c.newInstance();

			//1.����void���Ϳղη���
			Method m1 = c.getDeclaredMethod("doSomething", new Class<?>[] {});
			//������÷���
			m1.invoke(p, new Object[] {});

			//2.����void���͵��вη���
			Method m2 = c.getDeclaredMethod("doSomething", new Class<?>[] {
					int.class, String.class });
			m2.invoke(p, new Object[] { 10, "Tom" });

			//3.���þ�̬����
			Method m3 = c.getDeclaredMethod("method", new Class<?>[] {});
			m3.invoke(null, new Object[] {});

			//4.���÷������Ͳ���void�ķ���
			Method m4 = c
					.getDeclaredMethod("doReturnMethod", new Class<?>[] {});
			String result = (String) m4.invoke(p, new Object[] {});
			System.out.println(result);

			//5.����˽�л��ķ���
			Method m5 = c.getDeclaredMethod("doMethod", new Class<?>[] {});
			
			//����˽�з���ǰ���÷�������
			m5.setAccessible(true);
			
			m5.invoke(p, new Object[] {});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
