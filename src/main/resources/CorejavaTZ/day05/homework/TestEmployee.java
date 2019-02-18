package com.corejava.day05.homework;

public class TestEmployee {
	public static void main(String[] args) {

		//Employee m = new Employee(100, "Boss", 50000);

		//����
		Employee e1 = new Employee(1000, "Jack", 3000);
		Employee e2 = new Employee(1001, "Rose", 4000);
		Employee e3 = new Employee(1002, "Ben", 3500);
		Employee e4 = new Employee(1003, "Mary", 5000);

		//��˾
		Employee m = new Employee(100, "Boss", 50000, new Employee[] {});
		
		//ע��:
		//Ա������Ϊ�����������:
		//1.employees == null,����������,������������ж�,���ܳ��ֿ�ָ���쳣
		//2.employees.length == 0,��������,���������ǿյ�,������������ж�,���ܳ��������±�Խ��
		
		//���Ա��
		m.addEmp(e1);
		m.addEmp(e2);
		m.addEmp(e3);
		m.addEmp(e4);
		
		//�鿴Ա��
		m.printEmp();
		
		//�鿴����
		m.empCount();
	}
}
