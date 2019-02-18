package com.corejava.day08.interfaces;

/**汽车子类*/
public class Car extends Vehicle implements ICheckSpeed{

	@Override
	public void run(int dir) {
		System.out.println("汽车正在以" + getSpeed() + "KM/H的速度向"
				+ getDirection(dir) + "行驶.");
	}

	@Override
	public int getSpeed() {
		return 85;
	}
}
