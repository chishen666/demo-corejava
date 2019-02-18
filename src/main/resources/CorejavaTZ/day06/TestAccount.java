package com.corejava.day06;

public class TestAccount {
	public static void main(String[] args) {
		/*Account1 acc = new Account1(1000, "张三", 50000);
		acc.withdraw(2000);
		acc.deposit(20000);
		System.out.println(acc.getBalance());*/

		//创建银行账户对象
		Account acc = new Account(2000, "李四", 20000);

		//创建业务类对象
		AccountService as = new AccountService();

		//通过业务类对象调用方法
		as.withdraw(acc, 2000);
		as.deposit(acc, 50000);

		System.out.println(acc.getBalance());
	}
}
