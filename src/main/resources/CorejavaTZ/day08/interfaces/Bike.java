package com.corejava.day08.interfaces;

/**自行车子类*/
public class Bike extends Vehicle{

	@Override
	public void run(int dir) {
		System.out.println("自行车正在以" + getSpeed() + "KM/H的速度向"
				+ getDirection(dir) + "骑行.");
	}

	@Override
	public int getSpeed() {
		return 20;
	}
}
