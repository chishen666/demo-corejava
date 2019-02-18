package com.corejava.day15;

import java.lang.reflect.Field;

import com.corejava.day10.Student;

/**
 * ����������ʾ��������ض�����
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����10:36:26
 */
public class FieldReflectDemo {
	public static void main(String[] args) {
		Class<?> c = Student.class;
		
		//��ȡѧ�������ֽ���id������
		
		try {
			Field f = c.getDeclaredField("id");
			Student s = new Student(10,"Jack");
			
			//�ڲ���˽�г�Ա֮ǰ,�޸ķ���Ȩ��
			f.setAccessible(true);
			
			//ͨ�������ȡ����
			int value = (int) f.get(s);
			System.out.println(value);
			
			//ͨ�������޸�����ֵ
			f.set(s, 20);
			System.out.println(f.get(s));
			
		} catch (NoSuchFieldException e) {
			System.err.println("û�и�����!");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
