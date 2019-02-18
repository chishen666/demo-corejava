package com.carrx.corejava.relex;

public class Student {

	public static void main(String[] args) {
		test(123123);
	}

	public int id;

	protected String name;

	int age;

	private int sex; // 0=女 1=男

	public Student() {
	}

	public Student(int id) {
		this.id = id;
	}

	protected Student(String name) {
		this.name = name;
	}

	Student(int id, int age) {
		this(id);
		this.age = age;
	}

	@SuppressWarnings("unused")
	private Student(String name, int sex) {
		this(name);
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	private static int test(int a) {
		System.out.println(a);
		return a;
	}
}
