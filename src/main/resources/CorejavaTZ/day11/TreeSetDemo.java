package com.corejava.day11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import static com.corejava.day11.BookComparatorFactroy.*;

/**
 * ����������ʾTreeSetʵ�������������
 *
 * ����:JSD1412
 * ʱ��:2015-1-20 ����4:10:10
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//ͨ�����������Ƚ���
		Comparator<Book> c = BookComparatorFactroy.getBookComparator(PRICE);
		//ͨ���Ƚ�������TreeSet����
		TreeSet<Book> books = new TreeSet<>(c);

		Book b1 = new Book(1000, "��������", "����", 50);
		Book b2 = new Book(1004, "����Ϧʰ", "³Ѹ", 60);
		Book b3 = new Book(1003, "�������������ɵ�", "��˹�����˹��", 80);
		Book b4 = new Book(1005, "�����", "Ī��", 70);
		Book b5 = new Book(1002, "ˮ䰴�", "ʩ����", 30);
		Book b6 = new Book(1003, "�������������ɵ�", "��˹�����˹��", 80);

		//ҵ������ӷ���
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
