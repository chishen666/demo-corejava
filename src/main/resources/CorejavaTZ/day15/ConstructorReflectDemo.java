package com.corejava.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ����������ʾJava���似����ȡ���췽��,
 * ����ͨ�����췽����������
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����1:51:31
 */
public class ConstructorReflectDemo {
	public static void main(String[] args) {
		Class<?> c = Point.class;

		try {
			//���䴴���ղζ���
			/*Constructor<?> constructor = c.getDeclaredConstructor(new Class<?>[]{});
			Point p = (Point) constructor.newInstance(new Object[]{});*/

			//���䴴���вζ���
			/*Constructor<?> constructor = c
					.getDeclaredConstructor(new Class<?>[] { int.class,
							int.class });
			Point p = (Point) constructor.newInstance(new Object[] { 10, 20 });
			System.out.println(p);*/
			
			//ע��:����������ǿն���,�����ʹ�����²�����㷽��:
			Point p = (Point) c.newInstance();
			System.out.println(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
