package com.corejava.day06;

/**ƻ������*/
public class Apple extends Fruit {

	public Apple() {
		//������������ͬʱ�����ȴ����������,
		//��������������ʱ���õ����вι���,����������
		//������õ��ǿղι���,��super()����ʡ��
		//super();
		System.out.println("--����ղι���.");
	}

	/*public Apple(String color,double price){
		this.color = color;
		this.price = price;
	}*/

	public Apple(String color, double price) {
		//super�ؼ��ֱ�ʾ���ø������Ѿ����ڵ�ĳһ�����췽��
		//��д��Ҫ��д�ڹ��췽���ĵ�һ��
		super(color, price);
		System.out.println("--�����вι���.");
	}
}
