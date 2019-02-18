package com.corejava.day09;

/**
 * ����������ʾJava�쳣����ķ�ʽ
 * 1.��������
 * 2.��������
 * 
 * ����������ָ�ڴ����쳣�Ĵ�����ֱ��ʹ��try catch���в����Ҵ���
 * ����������ָ���쳣�׳�������,�����ɵ������������쳣�ķ�ʽ,Ҳ����
 * ˵���������ǲ�����,���ǰѴ����쳣��ʱ���Ӻ����,�ɵ�����������
 * �Ƿ���,�����߿���ֱ�ӻ��������,��ȻҲ���Լ�����������,��Ȼ,���
 * �쳣����׸���main()����,�������main�л�������,����һ�������쳣,
 * �޷��޸�.
 *
 * ����:JSD1412
 * ʱ��:2015-1-15 ����1:42:42
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		//method1();

		try {
			method2();
		} catch (NullPointerException e) {
			System.out.println("����Ϊ��!");
		}
	}

	//���������쳣
	public static void method1() {
		int[] arr = { 2, 6, 7, 9, 3, 5, 7, 9 };

		int result = 0;

		try {
			result = arr[10];
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException e) {
			//�쳣�������
			//e.printStackTrace();//��ӡ�쳣����Ķ�ջ��Ϣ
			System.out.println("�����±�Խ��!");

			result = arr[2];
			System.out.println(result);
		}
	}

	//��������
	public static void method2() throws NullPointerException,ArrayIndexOutOfBoundsException{
		int[] arr = {1,2,3};
		int result = arr[0];
		System.out.println(result);
		//throw new NullPointerException();
	}

	//���ѡ����ʽ?
	public static void A() throws InterruptedException {
		Thread.sleep(1000);
	}

	public static void B() {
		//��B������һ���Բ���ͬһ���쳣
		try {
			Thread.sleep(1000);
			A();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
