package com.corejava.day07.homework;

/**
 * ����������ʾ���þ�̬���Բ���Ψһ��ID
 *
 * ����:JSD1412
 * ʱ��:2015-1-13 ����1:59:24
 */
public class Employee {

	//��ͨ����(������ӵ�е�)ֻҪ��������,�ͻ����¸�ֵ
	private int id;//�����ʾ��

	//��̬����(����ӵ�е�,���ж�����)������ص�ʱ���ʼ������ֻ��һ�λ���
	private static int guid = 1000;

	private String name;
	private int age;

	public Employee() {
		this.id = guid++;
	}

	public Employee(String name, int age) {
		this.id = guid++;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Jack", 25);
		Employee e2 = new Employee("Tom", 21);
		Employee e3 = new Employee("Ann", 24);
		Employee e4 = new Employee("Rose", 28);
		System.out.println(e1.id);
		System.out.println(e2.id);
		System.out.println(e3.id);
		System.out.println(e4.id);
	}
}
