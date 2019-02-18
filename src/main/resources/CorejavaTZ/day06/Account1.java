package com.corejava.day06;

/**
 * 本类用来演示封装策略之一:业务类和实体类合二为一
 *
 * 作者:JSD1412
 * 时间:2015-1-12 上午9:49:05
 */

//银行账户实体类
public class Account1 {
	//属性
	private int id;
	private String name;
	private double balance;//余额

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

	//业务方法
	//取钱的方法
	public void withdraw(double money) {
		balance -= money;
	}

	//存钱的方法
	public void deposit(double money) {
		balance += money;
	}
}
