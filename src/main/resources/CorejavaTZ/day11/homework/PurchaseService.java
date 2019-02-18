package com.corejava.day11.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**业务类*/
public class PurchaseService {

	/**
	 * 把原始数据List集合转换成Map存储
	 */
	public Map<String, List<Purchase>> processData(List<Purchase> list) {
		//创建返回结果的数据集合
		Map<String, List<Purchase>> map = new HashMap<>();
		//遍历原始数据集合
		for (int i = 0; i < list.size(); i++) {
			Purchase p = list.get(i);
			//判断map中是否包含该品牌的商品
			if (map.containsKey(p.getBrand())) {
				//已经包含该产品,通过key获取value集合
				List<Purchase> pList = map.get(p.getBrand());
				//在现有的商品集合中添加该产品
				pList.add(p);
			} else {
				//不存在该产品,直接添加
				//创建该品牌专属的集合
				List<Purchase> pList = new ArrayList<>();
				//把该产品添加到相应的集合中
				pList.add(p);
				map.put(p.getBrand(), pList);
			}
		}
		return map;
	}

	/**
	 * 统计各品牌总费用,并且降序排列
	 */
	public void printData(Map<String, List<Purchase>> map) {
		//创建List集合对象供排序使用
		List<PurchasePX> pxList = new ArrayList<>();

		//创建TreeSet集合对象供排序使用
		/*TreeSet<PurchasePX> pxSet = new TreeSet<>(new Comparator<PurchasePX>() {
			@Override
			public int compare(PurchasePX o1, PurchasePX o2) {
				if (o1.getTotal() > o2.getTotal()) {
					return -1;
				} else if (o1.getTotal() < o2.getTotal()) {
					return 1;
				}
				return 0;
			}
		});*/

		Set<Entry<String, List<Purchase>>> entrys = map.entrySet();
		Iterator<Entry<String, List<Purchase>>> iter = entrys.iterator();
		while (iter.hasNext()) {
			Entry<String, List<Purchase>> entry = iter.next();
			//获取品牌
			String brand = entry.getKey();
			//获取各品牌对应的产品集合
			List<Purchase> value = entry.getValue();
			//获取每个产品集合中的总花费
			double total = 0.0;
			for (Purchase p : value) {
				total += p.getCost();
			}
			//把品牌和总费用封装成新的排序购买对象
			PurchasePX px = new PurchasePX(brand, total);

			//把新对象添加到排序集合中
			//pxSet.add(px);
			pxList.add(px);
		}

		Collections.sort(pxList, new Comparator<PurchasePX>() {
			@Override
			public int compare(PurchasePX o1, PurchasePX o2) {
				if (o1.getTotal() > o2.getTotal()) {
					return -1;
				} else if (o1.getTotal() < o2.getTotal()) {
					return 1;
				}
				return 0;
			}
		});

		//输出结果
		for (PurchasePX p : pxList) {
			System.out.println(p);
		}
	}
}
