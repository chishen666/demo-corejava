package com.corejava.day11.bms2;

import java.util.Comparator;

/**图书名字比较器*/
public class BookNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
