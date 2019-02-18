package com.corejava.day07.homework;

/**��ͨ���߹�����*/
public class VehicleFactory {
	public static final int BIKE = 1;
	public static final int CAR = 2;
	public static final int PLANE = 3;

	public static Vehicle getVehicle(int type) {
		Vehicle v = null;
		if (type == BIKE) {
			v = new Vehicle() {
				@Override
				public void run() {
					System.out.println("���г���������...");
				}
			};
		} else if (type == CAR) {
			v = new Vehicle() {
				@Override
				public void run() {
					System.out.println("����������ʻ...");
				}
			};
		} else if (type == PLANE) {
			v = new Vehicle() {
				@Override
				public void run() {
					System.out.println("�ɻ����ڷ���...");
				}
			};
		} else {
			System.out.println("�Բ���,�������Ϸ�!");
		}
		return v;
	}
}
