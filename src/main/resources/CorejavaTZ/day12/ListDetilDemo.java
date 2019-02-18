package com.corejava.day12;

import java.util.ArrayList;
import java.util.List;

import com.corejava.day10.Student;

/**
 * ����������ʾJava���Ϲ�����ϸ������
 *
 * ����:JSD1412
 * ʱ��:2015-1-21 ����1:44:53
 */
public class ListDetilDemo {
	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student(100, "Tom"));
		list1.add(new Student(101, "Jack"));
		list1.add(new Student(102, "Marry"));
		list1.add(new Student(103, "Rose"));
		List<Student> list2 = new ArrayList<>(list1);
		
		//�ǽṹ���޸�,�޸�Ԫ�ر���,�����һ�����ϲ���Ӱ���
		//list1.get(0).setName("Ann"); 
		
		//�ṹ���޸�,�޸ļ��Ͻṹ,�������һ�����ϲ���Ӱ��.
		//add,remove,sort...
		list1.remove(2);
		
		System.out.println(list2);
		
		System.out.println("-----------------");
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		list3.add(300);
		list3.add(400);
		List<Integer> list4 = new ArrayList<>(list3);
		
		list3.set(0, 888);
		
		System.out.println(list4);
		
		
	}
}
