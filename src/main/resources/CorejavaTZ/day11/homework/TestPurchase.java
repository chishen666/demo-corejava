package com.corejava.day11.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**测试类*/
public class TestPurchase {
	public static void main(String[] args) {
		
		//创建业务类对象
		PurchaseService ps = new PurchaseService();
		
		//原始数据集合
		List<Purchase> list = new ArrayList<>();
		Purchase p1 = new Purchase("宝洁", "洗手粉", 18.5);
		Purchase p2 = new Purchase("联合利华", "肥皂", 4.5);
		Purchase p3 = new Purchase("宝洁", "牙膏", 32.5);
		Purchase p4 = new Purchase("宝洁", "毛巾", 14.5);
		Purchase p5 = new Purchase("洁利", "洗面奶", 26.0);
		Purchase p6 = new Purchase("好迪", "洗发水", 27.5);
		Purchase p7 = new Purchase("多芬", "沐浴露", 38.5);
		Purchase p8 = new Purchase("多芬", "洗洁精", 3.4);
		Purchase p9 = new Purchase("联合利华", "洗手液", 6.5);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		
		//调用转换方法
		Map<String, List<Purchase>> map = ps.processData(list);
		
		ps.printData(map);
	}
}
