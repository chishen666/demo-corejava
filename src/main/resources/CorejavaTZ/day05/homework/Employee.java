package com.corejava.day05.homework;

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

	//��������ķ���
	public void addEmp(Employee employee) {
		//�жϱ���ӵ�Ա���Ƿ��Ǿ���
		if (employees != null) {
			//��ԭ���鳤������1����λ���Ҹ���
			employees = Arrays.copyOf(employees, employees.length + 1);
			employees[employees.length - 1] = employee;
		} else {
			//���û������,˵����Ա��������,����Ȩ���
			System.out.println("��Ա����Ȩ�������...");
		}
	}

	//����Լ����������ķ���
	public void printEmp() {
		//�жϵ�ǰԱ������˾��������
		if (employees != null) {
			if (employees.length != 0) {
				for (Employee e : employees) {
					System.out.println("Ա�����:" + e.id + ",Ա������:" + e.name
							+ ",Ա������:" + e.salary);
				}
			} else {
				System.out.println("����˾����������Ϣ...");
			}
		} else {
			System.out.println("��Ա��������...");
		}
	}

	//��ȡ�Լ���������������
	public void empCount() {
		if (employees != null) {
			System.out.println("��������Ϊ:" + employees.length);
		} else {
			System.out.println("��Ա��������...");
		}
	}
}
