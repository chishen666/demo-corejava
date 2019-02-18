package com.corejava.day05.homework;

public class Screen {
	private String type;
	private int size;
	private String brand;

	public Screen() {

	}

	public Screen(String type, int size, String brand) {
		super();
		this.type = type;
		//this.size = size;
		setSize(size);
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size == 17 || size == 19 || size == 23 || size == 25) {
			this.size = size;
			return;
		}
		System.err.println("尺寸不合法,已设置为默认值:17");
		this.size = 17;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
