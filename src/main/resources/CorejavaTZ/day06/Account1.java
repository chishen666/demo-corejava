package com.corejava.day06;

/**
 * ����������ʾ��װ����֮һ:ҵ�����ʵ����϶�Ϊһ
 *
 * ����:JSD1412
 * ʱ��:2015-1-12 ����9:49:05
 */

//�����˻�ʵ����
public class Account1 {
	//����
	private int id;
	private String name;
	private double balance;//���

	public Account1() {

	}

	public Account1(int id, String name, double balance) {
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

	//ҵ�񷽷�
	//ȡǮ�ķ���
	public void withdraw(double money) {
		balance -= money;
	}

	//��Ǯ�ķ���
	public void deposit(double money) {
		balance += money;
	}
}
