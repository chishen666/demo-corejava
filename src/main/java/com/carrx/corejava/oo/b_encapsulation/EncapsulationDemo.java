package com.carrx.corejava.oo.b_encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		testPerson();
	}

	@SuppressWarnings("unused")
	private static void testPerson() {
		Person p1 = new Person(12, "Tom");
		p1 = null;
		Person p3 = new Person(13, "Tom");
	}
}
