package com.corejava.day07.homework;

public class UsbDeviceService {

	private static UsbDeviceService service = new UsbDeviceService();

	private UsbDeviceService() {

	}

	public static UsbDeviceService getInstance() {
		return service;
	}

	public void run(UsbDevice device) {
		device.connection();
	}
}
