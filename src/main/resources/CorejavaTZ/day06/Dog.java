package com.corejava.day06;

/**��������*/
public class Dog extends Animal {

	//��������
	private double loyal;//�ҳ���

	public Dog() {

	}

	public Dog(String type, String name, double loyal) {
		super(type, name);
		this.loyal = loyal;
	}

	public double getLoyal() {
		return loyal;
	}

	public void setLoyal(double loyal) {
		this.loyal = loyal;
	}
	
	//���з���
	public void watchDoor(){
		System.out.println("���ڿ���...");
	}
	
	@Override
	public void eat() {
		System.out.println("���ڿй�ͷ...");
	}
}
