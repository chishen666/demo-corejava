package com.corejava.day05;

/**Ա���� -- ʵ����(Entity)*/
public class Employee {

	//����
	private int id;
	private String name;
	private int age;
	private double salary;

	//���ʵ������û������κι��췽��,��ϵͳ���Զ�����һ���ղι��칩��������ʹ��
	//���ʵ�������Ѿ�����ĳһ�����췽��,��ղι���Ͳ����Զ�������.
	//�ղι��췽��
	public Employee() {

	}

	//�в����Ĺ��췽��
	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		//this.name = name;
		setName(name);
		//this.age = age;
		setAge(age);//set�����빹�췽������ʵ�ֲ�����Ч���ж�����
		this.salary = salary;
	}

	//��ȡ����
	//��ȡ����
	public int getId() {
		return id;
	}

	//���÷���
	public void setId(int id) {
		//this�ؼ��ֱ�ʾ��ǰ����
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("ë��") || name.equals("ϰ��ƽ")) {
			System.err.println("no zuo no die!");
			return;
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//set�������Խ��в�����Ч�Ե��ж�
		if (age < 0 || age > 150) {
			System.err.println("�Բ���,���䲻�Ϸ�!");
			return;
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
