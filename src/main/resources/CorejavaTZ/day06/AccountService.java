package com.corejava.day06;

//业务类
public class AccountService {
	
	//业务方法
	//取钱的方法
	public void withdraw(Account acc,double money) {
		acc.setBalance(acc.getBalance() - money);
	}

	//存钱的方法
	public void deposit(Account acc,double money) {
		acc.setBalance(acc.getBalance() + money);
	}
}
