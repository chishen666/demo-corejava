package com.corejava.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.corejava.day11.Book;

/**
 * ����������ʾJava����Ԫ�صĲ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-21 ����2:30:28
 */
public class ListRemoveDemo {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		Book b1 = new Book(1000, "��������", "����", 50);
		Book b2 = new Book(1004, "����Ϧʰ", "³Ѹ", 60);
		Book b3 = new Book(1003, "�������������ɵ�", "��˹�����˹��", 80);
		Book b4 = new Book(1003, "�������������ɵ�", "��˹�����˹��", 80);
		Book b5 = new Book(1005, "�����", "Ī��", 70);
		Book b6 = new Book(1002, "ˮ䰴�", "ʩ����", 30);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);

		for (Book b : deleteBookByName(books, "�������������ɵ�")) {
			System.out.println(b);
		}
	}

	//����ԭ��:�±������ƶ�,��ɾ��Ԫ�غ�,�����Ԫ�ػ��Զ���ǰ�ƶ�,����,�����Ҫɾ����Ԫ��������ʱ,
	//���һ��Ԫ�ػ�����,û�б���⵽

	//�޸ķ���:
	public static List<Book> deleteBookByName(List<Book> books, String name) {
		/*for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				books.remove(book);
				i--;//1.���i--
			}
		}*/

		//2.i++�ı�λ��
		/*for (int i = 0; i < books.size(); ) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				books.remove(book);
			}else{
				i++;
			}
		}*/

		//3.����ɾ��
		for (int i = books.size() - 1; i >= 0; i--) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				books.remove(book);
			}
		}

		//����ԭ��:���ϵ�������֧�ֲ�������
		/*		Iterator<Book> iter = books.iterator();
				while (iter.hasNext()) {
					Book b = iter.next();
					if (b.getName().equals(name)) {
						//�޸ķ���:���õ����������ṩ��remove()����
						//books.remove(b);
						iter.remove();
					}
				}*/
		return books;
	}
}
