package com.corejava.day11.bms2;

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
			c = new BookIsbnComparator();
		} else if (type == NAME) {
			c = new BookNameComparator();
		} else if (type == PRICE) {
			c = new BookPriceComparator();
		} else {
			throw new IllegalArgumentException("对不起,参数不合法!");
		}
		return c;
	}
}
