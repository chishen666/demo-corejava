package com.corejava.day06;

/**
 * ����������ʾ��װ����֮һ:ҵ�����ʵ����ֿ�
 *
 * ����:JSD1412
 * ʱ��:2015-1-12 ����9:49:05
 */

//�����˻�ʵ����
public class Account {
	//����
	private int id;
	private String name;
	private double balance;//���

	public Account() {

	}

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
