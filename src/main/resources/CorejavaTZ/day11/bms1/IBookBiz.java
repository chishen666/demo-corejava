package com.corejava.day11.bms1;

/**�ṩͼ�����ϵͳ�еĳ��÷���*/
public interface IBookBiz {
	
	//���ͼ��ķ���
	void addBook(Book book);
	
	//ɾ��ͼ��ķ���
	void deleteBook(String name);
	
	//��ѯͼ����Ϣ
	void checkoutBook();

}
