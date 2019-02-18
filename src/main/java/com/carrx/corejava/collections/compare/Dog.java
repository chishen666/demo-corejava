package com.carrx.corejava.collections.compare;

public class Dog implements Comparable<Dog> {

	private int age;

	private String name;

	public Dog() {
	}

	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Dog o) {
		return this.age - o.age;
	}

}
