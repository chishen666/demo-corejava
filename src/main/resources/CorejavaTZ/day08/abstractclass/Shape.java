package com.corejava.day08.abstractclass;

/**��״������*/
public abstract class Shape {
	
	//����
	private String type;
	
	//����
	public Shape() {

	}

	public Shape(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//���󷽷�,û���κ�ʵ��
	public abstract double girth();
	
	public abstract double area();
}
