package com.corejava.day06;

public class TestAccount {
	public static void main(String[] args) {
		/*Account1 acc = new Account1(1000, "����", 50000);
		acc.withdraw(2000);
		acc.deposit(20000);
		System.out.println(acc.getBalance());*/

		//���������˻�����
		Account acc = new Account(2000, "����", 20000);

		//����ҵ�������
		AccountService as = new AccountService();

		//ͨ��ҵ���������÷���
		as.withdraw(acc, 2000);
		as.deposit(acc, 50000);

		System.out.println(acc.getBalance());
	}
}
