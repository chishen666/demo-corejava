package com.corejava.day05;

/**订单实体类*/
public class Order {
	private String id;
	private String name;
	private double price;
	private String company;

	public Order() {

	}

	public Order(String company) {
		this.company = company;
	}

	public Order(String id, String name, double price) {
		//this关键字:调用当前实体类中已经存在的某一个构造方法
		//此条语句必须放在构造方法的第一行
		this("TZ");
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
