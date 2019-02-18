package com.carrx.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionHandleDemo {
	public static void main(String[] args) {
		testCollection();
	}

	/**
	 * java8集合演示
	 */
	public static void testCollection() {
		List<Integer> l1 = Arrays.asList(new Integer[] { 1, 3, 5, 2, 6, 7, 3 });
		l1.forEach(item -> {
			System.out.print(item + " ");
		});
		System.out.println();

		l1.stream().filter(item -> item > 3).map(item -> item * 2).forEach(item -> {
			System.out.print(item + " ");
		});
		System.out.println();

		List<Integer> l2 = l1.stream().distinct().collect(Collectors.toList());
		l2.forEach(System.out::print);
	}
}
