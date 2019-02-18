package com.corejava.day10;

/**
 * 本类用来演示java.lang.Object类toString()方法
 *
 * 作者:JSD1412
 * 时间:2015-1-16 上午9:57:28
 */
public class ObjectDemo2 {
	public static void main(String[] args) {
		Student student1 = new Student(100, "Jack",new Clazz(20,"兴趣班"));
		Student student2 = new Student(101, "Rose");
		
		System.out.println(student1);
		
		//toString()方法会自动调用
		System.out.println(student2.toString());
	}
}
