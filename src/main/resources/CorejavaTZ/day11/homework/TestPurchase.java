package com.corejava.day11.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**������*/
public class TestPurchase {
	public static void main(String[] args) {
		
		//����ҵ�������
		PurchaseService ps = new PurchaseService();
		
		//ԭʼ���ݼ���
		List<Purchase> list = new ArrayList<>();
		Purchase p1 = new Purchase("����", "ϴ�ַ�", 18.5);
		Purchase p2 = new Purchase("��������", "����", 4.5);
		Purchase p3 = new Purchase("����", "����", 32.5);
		Purchase p4 = new Purchase("����", "ë��", 14.5);
		Purchase p5 = new Purchase("����", "ϴ����", 26.0);
		Purchase p6 = new Purchase("�õ�", "ϴ��ˮ", 27.5);
		Purchase p7 = new Purchase("���", "��ԡ¶", 38.5);
		Purchase p8 = new Purchase("���", "ϴ�ྫ", 3.4);
		Purchase p9 = new Purchase("��������", "ϴ��Һ", 6.5);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		
		//����ת������
		Map<String, List<Purchase>> map = ps.processData(list);
		
		ps.printData(map);
	}
}
