package com.corejava.day08.interfaces;

/**�ɻ�����*/
public class Plane extends Vehicle {

	@Override
	public void run(int dir) {
		System.out.println("�ɻ�������" + getSpeed() + "KM/H���ٶ���"
				+ getDirection(dir) + "����.");
	}

	@Override
	public int getSpeed() {
		return 800;
	}
}
