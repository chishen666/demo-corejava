package com.corejava.day08.homework1;

public class HourEmp extends Emp {

	public static final int PAY_EACH_HOUR = 15;
	private int hours;
	
	public HourEmp(int hours) {
		super();
		this.hours = hours;
	}

	@Override
	public double calcSalary() {
		return hours * PAY_EACH_HOUR;
	}
}
