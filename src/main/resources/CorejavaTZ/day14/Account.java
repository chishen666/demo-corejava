package com.corejava.day14;

/**
 * �˻���
 */
public class Account {
	// ���
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	/**
	 * ȡ��ķ�ʽ
	 */
	public void withdraw(int amount) {
		balance -= amount;
	}
}
