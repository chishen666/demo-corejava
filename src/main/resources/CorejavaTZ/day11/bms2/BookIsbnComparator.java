package com.corejava.day11.bms2;

import java.util.Comparator;

/**Í¼Êé±àºÅ±È½ÏÆ÷*/
public class BookIsbnComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getIsbn() > o2.getIsbn()) {
			return 1;
		} else if (o1.getIsbn() < o2.getIsbn()) {
			return -1;
		}
		return 0;
	}
}
