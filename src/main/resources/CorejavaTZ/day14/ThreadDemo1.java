package com.corejava.day14;

/**
 * ����������ʾJava�������̵߳����ַ�ʽ
 * дһ����̳�java.lang.Thread�ಢ����дrun()����
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����3:52:08
 */
public class ThreadDemo1 extends Thread {
	
	//ͨ��������߳�����
	public ThreadDemo1(String name) {
		super(name);
	}

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
		//�����̶߳���
		Thread t1 = new ThreadDemo1("Jack");
		Thread t2 = new ThreadDemo1("Rose");
		
		//��ȡ�߳����ȼ�,Ĭ����5��
		//System.out.println(t1.getPriority());
		//System.out.println(t2.getPriority());
		
		//�����߳����ȼ�
		t1.setPriority(1);//t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);//t2.setPriority(Thread.MAX_PRIORITY);
		
		//���߳�����
		//t1.setName("Jack : ");
		//t2.setName("Rose : ");
		
		//�����߳�
		t1.start();
		t2.start();
	}
}
