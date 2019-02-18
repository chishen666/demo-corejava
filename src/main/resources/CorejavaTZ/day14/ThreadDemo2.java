package com.corejava.day14;

/**
 * ����������ʾJava�����̵߳����ַ�ʽ
 * дһ����ʵ��java.lang.Runnable�ӿ�,������дrun()����
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����4:01:23
 */
public class ThreadDemo2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//��ȡ��ǰ����ִ�е��̵߳�����,���������,��ϵͳ�ṩĬ������
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//�ӿڴ���ʵ����
		Runnable r = new ThreadDemo2();
		
		//�������ֵķ�ʽ
		Thread t1 = new Thread(r,"Jack");
		Thread t2 = new Thread(r,"Rose");
		
		//t1.setName("Jack");
		//t2.setName("Rose");
		
		//�����߳�
		t1.start();
		t2.start();
	}

}
