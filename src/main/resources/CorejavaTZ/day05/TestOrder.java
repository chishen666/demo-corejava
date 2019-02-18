package com.corejava.day05;

public class TestOrder {
	public static void main(String[] args) {
		Order o1 = new Order("EZ20150109140300001", "电脑", 6000);
		Order o2 = new Order("EZ20150109140300002", "桌子", 800);
		Order o3 = new Order("EZ20150109140300003", "椅子", 100);
		Order o4 = new Order("EZ20150109140300004", "投影仪", 2000);
		Order o5 = new Order("EZ20150109140300005", "文具", 200);

		System.out.println(o1.getCompany());
	}
}
