package com.corejava.day15;

import java.lang.reflect.Field;

import com.corejava.day10.Student;

/**
 * 本类用来演示反射操作特定属性
 *
 * 作者:JSD1412
 * 时间:2015-1-23 上午10:36:26
 */
public class FieldReflectDemo {
	public static void main(String[] args) {
		Class<?> c = Student.class;
		
		//获取学生中名字叫做id的属性
		
		try {
			Field f = c.getDeclaredField("id");
			Student s = new Student(10,"Jack");
			
			//在操作私有成员之前,修改访问权限
			f.setAccessible(true);
			
			//通过反射获取属性
			int value = (int) f.get(s);
			System.out.println(value);
			
			//通过反射修改属性值
			f.set(s, 20);
			System.out.println(f.get(s));
			
		} catch (NoSuchFieldException e) {
			System.err.println("没有该属性!");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
