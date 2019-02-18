package com.corejava.day11.bms2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.corejava.util.InputUtil;

/**TreeSetʵ����--ҵ����*/
public class BookService implements IBookBiz {

	//����
	//�������ͼ�鲢������ļ���
	private Set<Book> books;

	public BookService() {

		System.out.println("1.����ISBN����");
		System.out.println("2.����NAME����");
		System.out.println("3.����PRICE����");
		int choice = InputUtil.inputInt("����ѡ��:");

		//ͨ������������ͬ�ıȽ���(�������)
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
