package com.corejava.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 本类用来演示Java集合工具类:Collections
 *
 * 作者:JSD1412
 * 时间:2015-1-21 上午11:15:53
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		Book b1 = new Book(1000, "骆驼祥子", "老舍", 50);
		Book b2 = new Book(1004, "朝花夕拾", "鲁迅", 60);
		Book b3 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);
		Book b4 = new Book(1005, "红高粱", "莫言", 70);
		Book b5 = new Book(1002, "水浒传", "施耐庵", 30);
		Book b6 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);

		//排序
		Collections.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return -1;
				} else if (o1.getPrice() < o2.getPrice()) {
					return 1;
				}
				return 0;
			}
		});

		printList(books);

		//反转结果
		Collections.reverse(books);

		System.out.println("-------------------");
		printList(books);

		//随机打乱
		Collections.shuffle(books);

		System.out.println("-------------------");
		printList(books);
	}

	public static void printList(List<Book> books) {
		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book);
		}
	}
}
