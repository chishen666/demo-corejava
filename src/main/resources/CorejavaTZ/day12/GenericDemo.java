package com.corejava.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����������ʾJava����
 *
 * ����:JSD1412
 * ʱ��:2015-1-21 ����4:43:35
 */
public class GenericDemo {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);

		List<Long> longList = new ArrayList<>();
		longList.add(100L);
		longList.add(200L);
		longList.add(300L);
		longList.add(400L);
		longList.add(500L);

		printList(intList);
		printList(longList);
	}

	/**
	 * ��������
	 */
								  //����ͨ��ָ������
	public static void printList(List<? extends Number> list) {
		Iterator<? extends Number> iter = list.iterator();
		while (iter.hasNext()) {
			Number n = iter.next();
			System.out.println(n);
		}
	}
}
