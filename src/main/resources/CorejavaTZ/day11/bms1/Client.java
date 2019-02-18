package com.corejava.day11.bms1;

/**客户端*/
public class Client {

	public static void main(String[] args) {
		//创建业务类对象
		BookService bs = new BookService();

		//准备原始数据
		Book b1 = new Book(1000, "骆驼祥子", "老舍", 50);
		Book b2 = new Book(1004, "朝花夕拾", "鲁迅", 60);
		Book b3 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);
		Book b4 = new Book(1005, "红高粱", "莫言", 70);
		Book b5 = new Book(1002, "水浒传", "施耐庵", 30);
		Book b6 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);

		//业务类添加方法
		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);
		bs.addBook(b5);
		bs.addBook(b6);

		//业务类遍历方法
		bs.checkoutBook();
	}
}
