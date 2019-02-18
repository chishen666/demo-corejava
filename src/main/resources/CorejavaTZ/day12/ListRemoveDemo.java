package com.corejava.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.corejava.day11.Book;

/**
 * 本类用来演示Java集合元素的操作
 *
 * 作者:JSD1412
 * 时间:2015-1-21 下午2:30:28
 */
public class ListRemoveDemo {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		Book b1 = new Book(1000, "骆驼祥子", "老舍", 50);
		Book b2 = new Book(1004, "朝花夕拾", "鲁迅", 60);
		Book b3 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);
		Book b4 = new Book(1003, "钢铁是怎样炼成的", "奥斯特洛夫斯基", 80);
		Book b5 = new Book(1005, "红高粱", "莫言", 70);
		Book b6 = new Book(1002, "水浒传", "施耐庵", 30);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);

		for (Book b : deleteBookByName(books, "钢铁是怎样炼成的")) {
			System.out.println(b);
		}
	}

	//错误原因:下标在下移动,而删除元素后,后面的元素会自动往前移动,所以,如果当要删除的元素是相邻时,
	//则后一个元素会跳过,没有被检测到

	//修改方法:
	public static List<Book> deleteBookByName(List<Book> books, String name) {
		/*for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				books.remove(book);
				i--;//1.添加i--
			}
		}*/

		//2.i++改变位置
		/*for (int i = 0; i < books.size(); ) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				books.remove(book);
			}else{
				i++;
			}
		}*/

		//3.反向删除
		for (int i = books.size() - 1; i >= 0; i--) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				books.remove(book);
			}
		}

		//错误原因:集合迭代器不支持并发操作
		/*		Iterator<Book> iter = books.iterator();
				while (iter.hasNext()) {
					Book b = iter.next();
					if (b.getName().equals(name)) {
						//修改方法:调用迭代器自身提供的remove()方法
						//books.remove(b);
						iter.remove();
					}
				}*/
		return books;
	}
}
