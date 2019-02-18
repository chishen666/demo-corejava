package com.corejava.day08.homework1;

public class FullTimeEmp extends Emp {

	private double total;
	private double rank;

	public FullTimeEmp(double total, double rank) {
		this.total = total;
		this.rank = rank;
	}

	@Override
	public double calcSalary() {
		return 3000 + total * rank;
	}
}
