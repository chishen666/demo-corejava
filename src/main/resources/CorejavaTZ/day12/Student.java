package com.corejava.day12;

/**ѧ��ʵ����*/
public class Student {
	private int id;
	private String name;
	private Gender gender;//ö������

	public Student(int id, String name, Gender gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		Student s = new Student(100, "Ann", Gender.FEMALE);
		
		//��ȡö�ٳ���������
		System.out.println(s.getGender().name());
	}
}
