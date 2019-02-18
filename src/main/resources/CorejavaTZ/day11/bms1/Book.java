package com.corejava.day11.bms1;

/**图书实体类*/
//要进行排序,必须依赖于排序接口
public class Book implements Comparable<Book> {
	private int isbn;//图书编号
	private String name;//书名
	private String author;//作者
	private double price;//价格

	public Book() {

	}

	public Book(int isbn, String name, String author, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + isbn;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=").append(isbn).append(", name=")
				.append(name).append(", author=").append(author)
				.append(", price=").append(price).append("]");
		return builder.toString();
	}

	//重写compareTo方法指定排序规则
	@Override
	public int compareTo(Book o) {
		System.out.println("--compareTo()");
		//按照价格排
		/*if (o.getPrice() < price) {
			return 1;
		} else if (o.getPrice() > price) {
			return -1;
		}
		return 0;*/
		
		//按照名字排
		return name.compareTo(o.getName());
	}
}
