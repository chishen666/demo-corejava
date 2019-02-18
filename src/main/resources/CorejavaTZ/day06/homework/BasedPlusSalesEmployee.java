package com.corejava.day06.homework;

import java.util.Date;

public class BasedPlusSalesEmployee extends SalesEmployee {

	private double base;

	public BasedPlusSalesEmployee() {

	}

	public BasedPlusSalesEmployee(String name, Date birthday, double total,
			double rank, double base) {
		super(name, birthday, total, rank);
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
		return super.getSalary(month) + base;
	}

	@Override
	public String toString() {
		return super.toString() + ",µ×Ð½:" + base;
	}
}
