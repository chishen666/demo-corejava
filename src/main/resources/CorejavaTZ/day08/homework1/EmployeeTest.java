package com.corejava.day08.homework1;

public class EmployeeTest {
	public static void main(String[] args) {
		Emp e1 = new Boss();
		System.out.println(e1.calcSalary());
		
		Emp e2 = new HourEmp(200);
		System.out.println(e2.calcSalary());
		
		Emp e3 = new FullTimeEmp(10000,0.1);
		System.out.println(e3.calcSalary());
	}
}
