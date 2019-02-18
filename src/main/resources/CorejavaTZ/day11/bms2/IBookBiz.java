package com.corejava.day11.bms2;

/**提供图书管理系统中的常用方法*/
public interface IBookBiz {
	
	//添加图书的方法
	void addBook(Book book);
	
	//删除图书的方法
	void deleteBook(String name);
	
	//查询图书信息
	void checkoutBook();

}
