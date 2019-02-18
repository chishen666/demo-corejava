package com.carrx.corejava.oo.c_extend;

public abstract class Animal implements Biology {

	private String name;
	private int age;

	public Animal() {
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public boolean compare(Biology biology) {
		if (biology instanceof Animal) {
			Animal animal = (Animal) biology;
			return age == animal.getAge();

		}
		return false;
	}
}
