package com.corejava.day06;

/**è������*/
public class Cat extends Animal {

	//���������,������������(����,��ʱ,è�м�������?)
	private double meng;//�ȶ�

	public Cat() {

	}

	//���ݸ��ഴ�����췽������Ҫ�ֶ�����Լ���������,���Ҹ�ֵ
	public Cat(String type, String name, double meng) {
		super(type, name);
		this.meng = meng;
	}

	//����Լ��������Ե�get/set����
	public double getMeng() {
		return meng;
	}

	public void setMeng(double meng) {
		this.meng = meng;
	}

	//�������еķ���
	public void catchMouse() {
		System.out.println("èץ����ķ���...");
	}
	
	@Override
	public void eat() {
		System.out.println("è�ڳ���...");
	}
}
