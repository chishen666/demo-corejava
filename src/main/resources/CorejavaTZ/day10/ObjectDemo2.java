package com.corejava.day10;

/**
 * ����������ʾjava.lang.Object��toString()����
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����9:57:28
 */
public class ObjectDemo2 {
	public static void main(String[] args) {
		Student student1 = new Student(100, "Jack",new Clazz(20,"��Ȥ��"));
		Student student2 = new Student(101, "Rose");
		
		System.out.println(student1);
		
		//toString()�������Զ�����
		System.out.println(student2.toString());
	}
}
