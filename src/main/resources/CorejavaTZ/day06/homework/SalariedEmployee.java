package com.corejava.day06.homework;

import java.util.Date;

public class SalariedEmployee extends Employee {

	private double base;

	public SalariedEmployee() {

	}

	public SalariedEmployee(String name, Date birthday, double base) {
		super(name, birthday);
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double getSalary(int month) {
		return isBirthdayMonth(month) + base;
	}

	@Override
	public String toString() {
		return super.toString() + ",µ×Ð½:" + base;
	}
}
