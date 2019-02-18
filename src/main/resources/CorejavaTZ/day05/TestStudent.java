package com.corejava.day05;

import java.util.Arrays;

/**������*/
public class TestStudent {
	public static void main(String[] args) {
		//1.����һ��ѧ��Ϊ100,����ΪAnn��ѧ��
		Student s1 = new Student(100, "Ann");

		//�޸�s1ѧԱ������,Ben
		s1.setName("Ben");

		//����һ���γ�����
		String[] courses = { "Java", "C++", "PHP" };

		//s1ѧԱѡ��γ�����
		s1.setCourses(courses);

		//�鿴s1ѧԱ��ѡ���ſε�����
		System.out.println(Arrays.toString(s1.getCourses()));

		//�鿴s1ѧԱ��ѡ�γ̵ĵڶ�����ʲô�γ�
		System.out.println(s1.getCourses()[1]);

		//�޸�s1ѧԱ���һ�ſγ�Ϊ.NET
		//s1.setCourses(new String[]{"Java","C++",".NET"});

		s1.getCourses()[2] = ".NET";
		System.out.println(Arrays.toString(s1.getCourses()));

		//����һ���༶
		Clazz clazz = new Clazz("JSD1412", 42);

		//��s1ѧԱѡ��ð༶
		s1.setClazz(clazz);

		//��ȡs1ѧԱ���ڰ༶������
		System.out.println(s1.getClazz().getClazzCap());

		//�޸�s1���ڰ༶JSD1413
		s1.getClazz().setClazzName("JSD1413");

		//����һ��ȫ�µ�ȫ��ϢѧԱ,200,Jack,"����,����,Ӣ��","��Ȥ�� 10"
		Student s2 = new Student(200, "Jack",
				new String[] { "����", "����", "Ӣ��" }, new Clazz("��Ȥ��", 10));
		
		Student s3 = new Student(101, "OZ");
		
		System.out.println(clazz.printClazzInfo());
		
		System.out.println(s2.printStudentInfo());
		System.out.println(s3.printStudentInfo());

	}
}
