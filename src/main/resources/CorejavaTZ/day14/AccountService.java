package com.corejava.day14;

/**
 * 线程同步问题
 */
public class AccountService implements Runnable {

	private static Account account = new Account();

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdraw(10);

			// 判断余额
			if (account.getBalance() < 0) {
				System.out.println("账户余额不足!");
			}
		}
	}

	// 取款的方法
	//内同步
	//private synchronized static void makeWithdraw(int amt) {
	
	private static void makeWithdraw(int amt) {
		//外同步
		synchronized (account) {
			if (account.getBalance() >= amt) {
				System.out
						.println(Thread.currentThread().getName() + "正在取钱...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.withdraw(amt);
				System.out.println(Thread.currentThread().getName()
						+ "完成取款,余额:" + account.getBalance());
			} else {
				System.out.println("没有足够的金额给["
						+ Thread.currentThread().getName() + "]去取,"
						+ account.getBalance());
			}
		}
	}

	public static void main(String[] args) {
		AccountService r = new AccountService();
		// 使用两个线程模拟两个用户
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Rose");
		two.setName("Jack");
		one.start();
		two.start();
	}
}
