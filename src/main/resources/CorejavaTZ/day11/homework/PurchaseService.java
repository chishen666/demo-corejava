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

/**ҵ����*/
public class PurchaseService {

	/**
	 * ��ԭʼ����List����ת����Map�洢
	 */
	public Map<String, List<Purchase>> processData(List<Purchase> list) {
		//�������ؽ�������ݼ���
		Map<String, List<Purchase>> map = new HashMap<>();
		//����ԭʼ���ݼ���
		for (int i = 0; i < list.size(); i++) {
			Purchase p = list.get(i);
			//�ж�map���Ƿ������Ʒ�Ƶ���Ʒ
			if (map.containsKey(p.getBrand())) {
				//�Ѿ������ò�Ʒ,ͨ��key��ȡvalue����
				List<Purchase> pList = map.get(p.getBrand());
				//�����е���Ʒ��������Ӹò�Ʒ
				pList.add(p);
			} else {
				//�����ڸò�Ʒ,ֱ�����
				//������Ʒ��ר���ļ���
				List<Purchase> pList = new ArrayList<>();
				//�Ѹò�Ʒ��ӵ���Ӧ�ļ�����
				pList.add(p);
				map.put(p.getBrand(), pList);
			}
		}
		return map;
	}

	/**
	 * ͳ�Ƹ�Ʒ���ܷ���,���ҽ�������
	 */
	public void printData(Map<String, List<Purchase>> map) {
		//����List���϶�������ʹ��
		List<PurchasePX> pxList = new ArrayList<>();

		//����TreeSet���϶�������ʹ��
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
			//��ȡƷ��
			String brand = entry.getKey();
			//��ȡ��Ʒ�ƶ�Ӧ�Ĳ�Ʒ����
			List<Purchase> value = entry.getValue();
			//��ȡÿ����Ʒ�����е��ܻ���
			double total = 0.0;
			for (Purchase p : value) {
				total += p.getCost();
			}
			//��Ʒ�ƺ��ܷ��÷�װ���µ����������
			PurchasePX px = new PurchasePX(brand, total);

			//���¶�����ӵ����򼯺���
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

		//������
		for (PurchasePX p : pxList) {
			System.out.println(p);
		}
	}
}
