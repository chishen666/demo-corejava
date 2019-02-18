package com.corejava.day07.homework;

/**
 * 本类用来演示利用静态属性产生唯一性ID
 *
 * 作者:JSD1412
 * 时间:2015-1-13 下午1:59:24
 */
public class Employee {

	//普通属性(对象所拥有的)只要创建对象,就会重新赋值
	private int id;//对象标示符

	//静态属性(类所拥有的,所有对象共享)在类加载的时候初始化并且只有一次机会
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
