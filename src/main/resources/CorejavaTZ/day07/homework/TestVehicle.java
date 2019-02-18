package com.corejava.day07.homework;

import static com.corejava.day07.homework.VehicleFactory.*;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle v = VehicleFactory.getVehicle(CAR);

		//创建业务类对象
		//VehicleService vs = new VehicleService();

		VehicleService vs = VehicleService.getInstance();

		vs.goHome(v);
	}
}
