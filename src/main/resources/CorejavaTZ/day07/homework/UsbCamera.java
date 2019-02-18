package com.corejava.day07.homework;

public class UsbCamera extends UsbDevice{
	@Override
	public void connection() {
		System.out.println("USB摄像头连接中...");
	}
}
