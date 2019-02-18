package com.corejava.day07.homework;

public class UsbMouse extends UsbDevice{
	@Override
	public void connection() {
		System.out.println("USB鼠标连接中...");
	}
}
