package com.corejava.day11.bms2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.corejava.util.InputUtil;

/**TreeSet实现类--业务类*/
public class BookService implements IBookBiz {

	//属性
	//用来存放图书并且排序的集合
	private Set<Book> books;

	public BookService() {

		System.out.println("1.按照ISBN排序");
		System.out.println("2.按照NAME排序");
		System.out.println("3.按照PRICE排序");
		int choice = InputUtil.inputInt("请您选择:");

		//通过工厂创建不同的比较器(排序规则)
		Comparator<Book> c = BookComparatorFactroy.getBookComparator(choice);
		books = new TreeSet<>(c);
	}

	@Override
	public void addBook(Book book) {
		books.add(book);
	}

	@Override
	public void deleteBook(String name) {
		for (Book book : books) {
			if (book.getName().equals(name)) {
				books.remove(book);
			}
		}
	}

	@Override
	public void checkoutBook() {
		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book);
		}
	}
}
