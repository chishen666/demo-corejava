package com.corejava.day08.interfaces;

/**��������*/
public class Car extends Vehicle implements ICheckSpeed{

	@Override
	public void run(int dir) {
		System.out.println("����������" + getSpeed() + "KM/H���ٶ���"
				+ getDirection(dir) + "��ʻ.");
	}

	@Override
	public int getSpeed() {
		return 85;
	}
}
