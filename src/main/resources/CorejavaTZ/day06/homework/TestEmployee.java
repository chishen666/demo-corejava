package com.corejava.day06.homework;

import com.corejava.util.DateUtil;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee("Tom", DateUtil.createDate(1993, 6,
				7), 4500);
		System.out.println(e1);
		System.out.println(e1.getSalary(6));

		Employee e2 = new HourlyEmployee("Jack",
				DateUtil.createDate(1995, 7, 4), 200);
		System.out.println(e2);
		System.out.println(e2.getSalary(7));

		Employee e3 = new SalesEmployee("Ann",
				DateUtil.createDate(1989, 1, 10), 100000, 0.1);
		System.out.println(e3);
		System.out.println(e3.getSalary(1));

		Employee e4 = new BasedPlusSalesEmployee("Ben", DateUtil.createDate(
				1988, 3, 4), 100000, 0.1, 3000);
		System.out.println(e4);
		System.out.println(e4.getSalary(3));

	}
}
