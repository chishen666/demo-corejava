package com.corejava.day06.homework;

import java.util.Date;

public class HourlyEmployee extends Employee {

	private int hours;

	//��������,����Ҫ�ṩget/set����,Ҳ����Ҫ���빹�췽��
	public static final double PAY_EACH_HOUR = 20;

	public HourlyEmployee() {

	}

	public HourlyEmployee(String name, Date birthday, int hours) {
		super(name, birthday);
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public double getSalary(int month) {
		double salary = PAY_EACH_HOUR * hours + isBirthdayMonth(month);
		if (hours - 160 > 0) {
			salary += (hours - 160) * PAY_EACH_HOUR * 0.5;
		}
		return salary;
	}

	@Override
	public String toString() {
		return super.toString() + ",����Сʱ��:" + hours + "," + PAY_EACH_HOUR
				+ "Ԫ/Сʱ";
	}
}
