package com.corejava.day11.bms2;

import java.util.Comparator;

/**图书价格比较器*/
public class BookPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		return 0;
	}
}
