package com.corejava.day07.homework;

/**“µŒÒ¿‡*/
public class VehicleService {

	private static VehicleService service = null;

	private VehicleService() {

	}

	public static VehicleService getInstance() {
		if (service == null) {
			service = new VehicleService();
		}
		return service;
	}

	public void goHome(Vehicle vehicle) {
		vehicle.run();
	}
}
