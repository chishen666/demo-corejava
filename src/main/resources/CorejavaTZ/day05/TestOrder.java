package com.corejava.day05;

public class TestOrder {
	public static void main(String[] args) {
		Order o1 = new Order("EZ20150109140300001", "����", 6000);
		Order o2 = new Order("EZ20150109140300002", "����", 800);
		Order o3 = new Order("EZ20150109140300003", "����", 100);
		Order o4 = new Order("EZ20150109140300004", "ͶӰ��", 2000);
		Order o5 = new Order("EZ20150109140300005", "�ľ�", 200);

		System.out.println(o1.getCompany());
	}
}
