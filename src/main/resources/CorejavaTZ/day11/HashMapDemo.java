package com.corejava.day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����������ʾHashMap����
 *
 * ����:JSD1412
 * ʱ��:2015-1-21 ����9:21:50
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//����һ��Map����
		Map<Integer, String> map = new HashMap<>();
		//���Ԫ��
		map.put(2, "one");
		map.put(1, "one");
		map.put(4, "four");
		map.put(1, "one-again");
		map.put(3, "one");
		//���KEYֵ���򲻿��ظ�,value�����ظ�
		//ע��:��ͬKEYֵ��һ��Ԫ�ػ��ǰһ��Ԫ�ص�value����!!!

		//�ж�Map�����Ƿ����ָ��KEY����VALUE
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("one"));

		//ͨ��KEY��ȡVALUE
		System.out.println(map.get(1));
		
		//��Map�����е�valueȡ��
		Collection<String> values = map.values();
		System.out.println(values);
		

		//����
		//1.ֱ�Ӵ�ӡ
		System.out.println(map);

		//2.keySet()��ʽ����
		//a.��Map���������е�keyֵȡ�������뵽һ��Set������
		Set<Integer> keys = map.keySet();
		//b.����keys����
		Iterator<Integer> iter1 = keys.iterator();
		while (iter1.hasNext()) {
			//c.��ȡ���е�keyֵ
			Integer key = iter1.next();
			//d.ͨ��key��ȡvalue
			String value = map.get(key);
			System.out.println(key + " <===> " + value);
		}

		//3.entrySet()��������
		//a.��Map���������еļ�ֵ�Է�װ��һ��Entry����,���ҷ��뵽Set������
		Set<Entry<Integer, String>> entrys = map.entrySet();
		//b.����Set����
		Iterator<Entry<Integer, String>> iter2 = entrys.iterator();
		while (iter2.hasNext()) {
			//c.��ȡÿһ����װ�ļ�ֵ�Զ���
			Entry<Integer, String> entry = iter2.next();
			//d.ͨ��Entry�����е�getXXX()��������ȡKEY,VALUE
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " <===> " + value);
		}
	}
}
