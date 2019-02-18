package com.corejava.day06;

import java.util.Arrays;

//ҵ����
public class EmployeeService {
	//��������ķ���
	public void addEmp(Employee manager, Employee employee) {
		//�жϱ���ӵ�Ա���Ƿ��Ǿ���
		if (manager.getEmployees() != null) {
			manager.setEmployees(Arrays.copyOf(manager.getEmployees(),
					manager.getEmployees().length + 1));
			manager.getEmployees()[manager.getEmployees().length - 1] = employee;
		} else {
			//���û������,˵����Ա��������,����Ȩ���
			System.out.println("��Ա����Ȩ�������...");
		}
	}

	//����Լ����������ķ���
	public void printEmp(Employee employee) {
		Employee[] employees = employee.getEmployees();
		//�жϵ�ǰԱ������˾��������
		if (employees != null) {
			if (employees.length != 0) {
				for (Employee e : employees) {
					System.out.println("Ա�����:" + e.getId() + ",Ա������:"
							+ e.getName() + ",Ա������:" + e.getSalary());
				}
			} else {
				System.out.println("����˾����������Ϣ...");
			}
		} else {
			System.out.println("��Ա��������...");
		}
	}

	//��ȡ�Լ���������������
	public void empCount(Employee employee) {
		if (employee.getEmployees() != null) {
			System.out.println("��������Ϊ:" + employee.getEmployees().length);
		} else {
			System.out.println("��Ա��������...");
		}
	}
}
