package com.corejava.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ����������ʾArrayList�ĳ��÷���
 *
 * ����:JSD1412
 * ʱ��:2015-1-20 ����10:33:17
 */
public class ArrayListDemo {
	public static void main(String[] args) {

		//JDK5.0֮ǰ,���ϴ������Ͱ�ȫ����,���п��Է��κ����͵�Ԫ��
		//ArrayList list = new ArrayList();
		//list.add(100);
		//list.add(true);

		//JDK5.0֮��,������JCF��������д,�����˷��͸���,�������þ���:
		//����Լ�����ϵ�Ԫ������,�������Ͱ�ȫ����

		//1.����Ĭ�ϳ�ʼ����Ϊ10��������λ�ļ���
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		//list1.add(3.14);//�˼���ֻ�ܴ��Integer���͵�Ԫ��

		//2.����ָ�������ļ���
		List<String> list2 = new ArrayList<String>(5);

		//3.����һ����֪�ļ��Ϲ���һ���¼���
		List<String> list3 = new ArrayList<String>(list2);

		//JDK7.0ʱ,�ṩ�˼���ʽ
		List<Integer> list4 = new ArrayList<>();

		System.out.println("---------------------------------------");

		List<Integer> list = new ArrayList<>();

		//���÷���:
		//1.��Ӽ���Ԫ��
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(3);//����,���ظ�

		//2.��ռ���Ԫ��
		//list.clear();

		//3.�жϼ������Ƿ����ָ��Ԫ��
		boolean b1 = list.contains(3);
		System.out.println(b1);

		//4.ͨ���±��ȡ����Ԫ��
		//����±곬����Χ,���׳��쳣:java.lang.IndexOutOfBoundsException
		System.out.println(list.get(0));

		//5.��ȡԪ�ص�һ�γ��ֵ��±�,���������,�򷵻�-1
		int index1 = list.indexOf(3);
		System.out.println(index1);

		//��ȡԪ�����һ�γ��ֵ��±�,���������,�򷵻�-1
		int index2 = list.lastIndexOf(3);
		System.out.println(index2);

		//6.�жϼ���Ԫ���Ƿ�Ϊ��
		System.out.println(list.isEmpty());

		//7.ɾ������Ԫ��
		//a.�����±�ɾ��Ԫ��
		//list.remove(2);
		
		//b.����Ԫ��ɾ��(ɾ���״γ��ֵ�)
		//boolean b2 = list.remove(new Integer(3));
		
		//8.ͨ���±��޸�Ԫ��
		list.set(2, 888);
		
		//9.��ȡ����Ԫ�ظ���
		System.out.println(list.size());
		
		//����
		
		//���ϵ�����ͨ�÷�ʽ--���ϵ���������
		//a.������ǰ���ϵ�����
		Iterator<Integer> iter = list.iterator();
		//b.ѭ������
		while(iter.hasNext()){
			//���������һ��,���ȡ
			Integer i = iter.next();
			System.out.println(i);
		}
		
		//1.ֱ�Ӵ�ӡ
		System.out.println(list);
		
		//2.ת��������
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		//3.��ͨforѭ��
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i));
		}
		
		//4.��ǿforѭ��
		for(Integer i : list){
			System.out.println(i);
		}
	}
}
