package com.corejava.day11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.corejava.day10.Student;

/**
 * ����������ʾLinkedList������������
 *
 * ����:JSD1412
 * ʱ��:2015-1-20 ����11:12:57
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		Student s1 = new Student(100, "Jack");
		Student s2 = new Student(101, "Ann");
		Student s3 = new Student(102, "Ben");
		Student s4 = new Student(103, "Cherry");

		//����һ�����ѧ���ļ���
		List<Student> students = new LinkedList<>();

		//���ѧ��
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		//����
		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s);
		}
	}
}
