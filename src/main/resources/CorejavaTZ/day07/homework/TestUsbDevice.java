package com.corejava.day07.homework;

import static com.corejava.day07.homework.UsbDeviceFactory.*;

public class TestUsbDevice {
	public static void main(String[] args) {
		UsbDevice device = UsbDeviceFactory.getUsbDevice(KEYBOARD);
		
		UsbDeviceService service = UsbDeviceService.getInstance();
		
		service.run(device);
	}
}
