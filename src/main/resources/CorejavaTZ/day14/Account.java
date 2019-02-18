package com.corejava.day14;

/**
 * 账户类
 */
public class Account {
	// 余额
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	/**
	 * 取款的方式
	 */
	public void withdraw(int amount) {
		balance -= amount;
	}
}
