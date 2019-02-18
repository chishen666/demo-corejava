package com.carrx.corejava.java8;

@FunctionalInterface
public interface InterfaceA {
	void test();

	default void aa() {
		System.out.println(123);
	}

	static void bb() {
		System.out.println(123);
	}
}
