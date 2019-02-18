package com.corejava.day06;

import java.util.Arrays;

/**员工实体类 -- 自关联*/
public class Employee {
	//属性
	private int id;//编号
	private String name;//姓名
	private double salary;//工资

	//private Employee manager;//上司

	private Employee[] employees;//下属数组

	public Employee() {

	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, Employee[] employees) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
}
