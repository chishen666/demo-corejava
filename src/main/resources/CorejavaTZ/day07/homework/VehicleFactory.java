package com.corejava.day07.homework;

/**交通工具工厂类*/
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
					System.out.println("自行车正在骑行...");
				}
			};
		} else if (type == CAR) {
			v = new Vehicle() {
				@Override
				public void run() {
					System.out.println("汽车正在行驶...");
				}
			};
		} else if (type == PLANE) {
			v = new Vehicle() {
				@Override
				public void run() {
					System.out.println("飞机正在飞行...");
				}
			};
		} else {
			System.out.println("对不起,参数不合法!");
		}
		return v;
	}
}
