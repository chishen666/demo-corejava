package com.corejava.day05;

/**����ʵ����*/
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
		//this�ؼ���:���õ�ǰʵ�������Ѿ����ڵ�ĳһ�����췽��
		//������������ڹ��췽���ĵ�һ��
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
