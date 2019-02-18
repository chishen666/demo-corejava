package com.corejava.day05.homework;

public class Computer {
	private String brand;
	private double price;
	private String description;

	private Screen screen;

	public Computer() {

	}

	public Computer(String brand, double price, String description) {
		this.brand = brand;
		//this.price = price;
		setPrice(price);
		this.description = description;
	}

	public Computer(String brand, double price, String description,
			Screen screen) {
		this.brand = brand;
		//this.price = price;
		setPrice(price);
		this.description = description;
		this.screen = screen;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 1000 || price > 20000) {
			this.price = 2000;
			System.err.println("价格不合法,已设置为默认值:2000");
			return;
		}
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public void outputComputerInfo() {
		System.out.println("计算机品牌:" + brand + ",价格:" + price + ",描述:"
				+ description);
		if (screen != null) {
			System.out.println("\t显示器类型:" + screen.getType() + ",尺寸:"
					+ screen.getSize() + ",品牌:" + screen.getBrand());
		} else {
			System.out.println("\t该电脑暂无屏幕信息...");
		}
	}
}
