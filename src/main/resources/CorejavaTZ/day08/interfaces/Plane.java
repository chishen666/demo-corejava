package com.corejava.day08.interfaces;

/**飞机子类*/
public class Plane extends Vehicle {

	@Override
	public void run(int dir) {
		System.out.println("飞机正在以" + getSpeed() + "KM/H的速度向"
				+ getDirection(dir) + "飞行.");
	}

	@Override
	public int getSpeed() {
		return 800;
	}
}
