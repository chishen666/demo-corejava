package com.corejava.day08.interfaces;

/**���г�����*/
public class Bike extends Vehicle{

	@Override
	public void run(int dir) {
		System.out.println("���г�������" + getSpeed() + "KM/H���ٶ���"
				+ getDirection(dir) + "����.");
	}

	@Override
	public int getSpeed() {
		return 20;
	}
}
