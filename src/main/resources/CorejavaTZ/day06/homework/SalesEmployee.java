package com.corejava.day06.homework;

import java.util.Date;

public class SalesEmployee extends Employee {

	private double total;
	private double rank;

	public SalesEmployee() {

	}

	public SalesEmployee(String name, Date birthday, double total, double rank) {
		super(name, birthday);
		this.total = total;
		this.rank = rank;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}
	
	@Override
	public double getSalary(int month) {
		return total * rank + isBirthdayMonth(month);
	}
	
	@Override
	public String toString() {
		return super.toString() + ",销售额:" + total + ",提成率:" + rank;
	}
}
