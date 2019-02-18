package com.carrx.corejava.oo.c_extend;

public class ExtendDemo {

	public static void main(String[] args) {
		Animal ac = new Cat("Tom", 5);
		Animal ad = new Dog("Snoopy", 5);
		System.out.println(ac.compare(ad));
		ac.sayHello();
		ad.sayHello();
	}
}
