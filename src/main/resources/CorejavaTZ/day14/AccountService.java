package com.corejava.day14;

/**
 * �߳�ͬ������
 */
public class AccountService implements Runnable {

	private static Account account = new Account();

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdraw(10);

			// �ж����
			if (account.getBalance() < 0) {
				System.out.println("�˻�����!");
			}
		}
	}

	// ȡ��ķ���
	//��ͬ��
	//private synchronized static void makeWithdraw(int amt) {
	
	private static void makeWithdraw(int amt) {
		//��ͬ��
		synchronized (account) {
			if (account.getBalance() >= amt) {
				System.out
						.println(Thread.currentThread().getName() + "����ȡǮ...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.withdraw(amt);
				System.out.println(Thread.currentThread().getName()
						+ "���ȡ��,���:" + account.getBalance());
			} else {
				System.out.println("û���㹻�Ľ���["
						+ Thread.currentThread().getName() + "]ȥȡ,"
						+ account.getBalance());
			}
		}
	}

	public static void main(String[] args) {
		AccountService r = new AccountService();
		// ʹ�������߳�ģ�������û�
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Rose");
		two.setName("Jack");
		one.start();
		two.start();
	}
}
