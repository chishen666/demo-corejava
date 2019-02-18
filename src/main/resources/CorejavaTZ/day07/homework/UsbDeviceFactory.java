package com.corejava.day07.homework;

public class UsbDeviceFactory {
	public static final int MOUSE = 1;
	public static final int KEYBOARD = 2;
	public static final int CAMERA = 3;

	public static UsbDevice getUsbDevice(int type) {
		UsbDevice ud = null;
		if (type == MOUSE) {
			ud = new UsbMouse();
		} else if (type == KEYBOARD) {
			ud = new UsbKeyBoard();
		} else if (type == CAMERA) {
			ud = new UsbCamera();
		} else {
			System.out.println("对不起,参数不合法!");
		}
		return ud;
	}

}
