package com.carrx.corejava.oo.c_extend;

public class Dog extends Animal {

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void sayHello() {
		System.out.println("Hello, I'm Dog!");
	}
}
