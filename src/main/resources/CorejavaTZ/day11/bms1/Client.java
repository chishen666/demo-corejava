package com.corejava.day11.bms1;

/**�ͻ���*/
public class Client {

	public static void main(String[] args) {
		//����ҵ�������
		BookService bs = new BookService();

		//׼��ԭʼ����
		Book b1 = new Book(1000, "��������", "����", 50);
		Book b2 = new Book(1004, "����Ϧʰ", "³Ѹ", 60);
		Book b3 = new Book(1003, "�������������ɵ�", "��˹�����˹��", 80);
		Book b4 = new Book(1005, "�����", "Ī��", 70);
		Book b5 = new Book(1002, "ˮ䰴�", "ʩ����", 30);
		Book b6 = new Book(1003, "�������������ɵ�", "��˹�����˹��", 80);

		//ҵ������ӷ���
		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);
		bs.addBook(b5);
		bs.addBook(b6);

		//ҵ�����������
		bs.checkoutBook();
	}
}
