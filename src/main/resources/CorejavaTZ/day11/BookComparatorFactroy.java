package com.corejava.day11;

import java.util.Comparator;

/**图书比较器工厂*/
public class BookComparatorFactroy {

	//属性
	public static final int ISBN = 1;
	public static final int NAME = 2;
	public static final int PRICE = 3;

	public static Comparator<Book> getBookComparator(int type) {
		Comparator<Book> c = null;
		if (type == ISBN) {
			c = new Comparator<Book>() {
				@Override
				public int compare(Book o1, Book o2) {
					if (o1.getIsbn() > o2.getIsbn()) {
						return 1;
					} else if (o1.getIsbn() < o2.getIsbn()) {
						return -1;
					}
					return 0;
				}
			};
		} else if (type == NAME) {
			c = new Comparator<Book>() {
				@Override
				public int compare(Book o1, Book o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
		} else if (type == PRICE) {
			c = new Comparator<Book>() {
				@Override
				public int compare(Book o1, Book o2) {
					if (o1.getPrice() > o2.getPrice()) {
						return 1;
					} else if (o1.getPrice() < o2.getPrice()) {
						return -1;
					}
					return 0;
				}
			};
		} else {
			throw new IllegalArgumentException("对不起,参数不合法!");
		}
		return c;
	}
}
