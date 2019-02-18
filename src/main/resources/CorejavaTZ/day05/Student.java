package com.corejava.day05;

import java.util.Arrays;

/**ѧ��ʵ����*/
public class Student {
	//����
	private int id;
	private String name;
	private String[] courses;//�γ���������

	private Clazz clazz;//ѧ�����ڵİ༶

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String[] courses, Clazz clazz) {
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.clazz = clazz;
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

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	/**
	 * ��ӡѧ��������Ϣ
	 */
	public String printStudentInfo() {
		String message = "ѧ��:" + id + ",����:" + name;
		if (courses != null) {
			message += ",��ѡ�γ�:" + Arrays.toString(courses);
		}
		if (clazz != null) {
			message += clazz.printClazzInfo();
		}
		return message;
	}
}
