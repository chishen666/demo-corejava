package com.corejava.day11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import static com.corejava.day11.BookComparatorFactroy.*;

/**
 * 本类用来演示TreeSet实现任意规则排序
 *
 * 作者:JSD1412
 * 时间:2015-1-20 下午4:10:10
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//通过工厂创建比较器
		Comparator<Book> c = BookComparatorFactroy.getBookComparator(PRICE);
		//通过比较器构建TreeSet集合
		TreeSet<Book> books = new TreeSet<>(c);

		Book b1 = new Book(1000, "骆驼祥子", "老舍", 50);
		Book b2 = new Book(1004, "朝花夕拾", "鲁迅", 60);
		Book b3 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);
		Book b4 = new Book(1005, "红高粱", "莫言", 70);
		Book b5 = new Book(1002, "水浒传", "施耐庵", 30);
		Book b6 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);

		//业务类添加方法
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);

		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book);
		}
	}
}
