package com.corejava.day06;

//ҵ����
public class AccountService {
	
	//ҵ�񷽷�
	//ȡǮ�ķ���
	public void withdraw(Account acc,double money) {
		acc.setBalance(acc.getBalance() - money);
	}

	//��Ǯ�ķ���
	public void deposit(Account acc,double money) {
		acc.setBalance(acc.getBalance() + money);
	}
}
