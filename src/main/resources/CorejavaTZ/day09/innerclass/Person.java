package com.corejava.day09.innerclass;

public abstract class Person {

	public static void main(String[] args) {
		new Person() {
			@Override
			public void eat() {
				System.out.println("³Ô·¹!");
			}
		}.eat();
	}

	public abstract void eat();
}