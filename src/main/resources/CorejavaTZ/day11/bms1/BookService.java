package com.corejava.day11.bms1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**TreeSetʵ����--ҵ����*/
public class BookService implements IBookBiz {

	//����
	//�������ͼ�鲢������ļ���
	private Set<Book> books = new TreeSet<>();

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
