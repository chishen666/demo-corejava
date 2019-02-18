package com.corejava.day06;

import java.util.Arrays;

/**Ա��ʵ���� -- �Թ���*/
public class Employee {
	//����
	private int id;//���
	private String name;//����
	private double salary;//����

	//private Employee manager;//��˾

	private Employee[] employees;//��������

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
