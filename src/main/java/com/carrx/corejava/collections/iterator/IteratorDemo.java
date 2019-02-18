package com.carrx.corejava.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		testIterator();
	}

	static void testIterator() {
		List<String> names = new ArrayList<>();
		names.add("李四");
		names.add("王五");
		names.add("张三");
		names.add("张三");

		//1.普通for循环遍历,删除元素,这种方法错误,会由于位置移动导致未移除元素,修改为下面的倒序遍历可以解决问题
		//		for (int i = 0; i < names.size(); i++) {
		//			if ("张三".equals(names.get(i))) {
		//				names.remove(names.get(i));
		//			}
		//		}

		//2.普通for循环倒序遍历,删除元素
		//		for (int i = names.size() - 1; i >= 0; i--) {
		//			if ("张三".equals(names.get(i))) {
		//				names.remove(names.get(i));
		//			}
		//		}

		//3.增强for循环遍历,删除元素,这种方法也错误,由于fail-fast机制,导致错误
		//		for (String name : names) {
		//			if ("张三".equals(name)) {
		//				names.remove(name);
		//			}
		//		}

		//4.iterator遍历,删除元素
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			String name = i.next();
			if ("张三".equals(name)) {
				i.remove();//注意,不是用names.remove
			}
		}

		names.forEach(System.out::println);
	}
}
