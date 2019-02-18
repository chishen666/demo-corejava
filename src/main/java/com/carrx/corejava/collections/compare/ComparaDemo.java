package com.carrx.corejava.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparaDemo {

	public static void main(String[] args) {
		compareTest();
	}

	static void compareTest() {
		List<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog(4, "dog1"));
		dogList.add(new Dog(5, "dog2"));
		dogList.add(new Dog(3, "dog3"));
		dogList.add(new Dog(7, "dog4"));

		// 1:使用comparable排序
		// Collections.sort(dogList);

		// 2:使用comparator排序
		// Collections.sort(dogList, new DogComparator());

		// 3:使用comparator内部类排序
		//		Collections.sort(dogList, new Comparator<Dog>() {
		//			@Override
		//			public int compare(Dog dog1, Dog dog2) {
		//				return dog1.getAge() - dog2.getAge();
		//			}
		//		});

		// 4:使用comparator的lambda表达式排序
		Collections.sort(dogList, (dog1, dog2) -> {
			return dog1.getAge() - dog2.getAge();
		});

		dogList.forEach(dog -> {
			System.out.println(dog.getAge());
		});
	}
}
