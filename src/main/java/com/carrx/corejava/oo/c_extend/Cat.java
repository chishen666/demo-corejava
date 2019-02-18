package com.carrx.corejava.oo.c_extend;

public class Cat extends Animal {

	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void sayHello() {
		System.out.println("Hello, I'm Cat!");
	}

}
