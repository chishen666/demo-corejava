package com.corejava.day12;

public class TestSeason {
	public static void main(String[] args) {

		System.out.println(Season.WINTER);
		System.out.println(Season.WINTER.toString());

		//��ȡö�ٳ���������
		System.out.println(Season.WINTER.name());

		Season nextSeason = Season.WINTER.next();
		System.out.println(nextSeason);

		//�ѵ�ǰö�������е�ö�ٳ������뵽������,API��û����¼
		Season[] seasons = Season.values();
		for (Season s : seasons) {
			System.out.println(s);
		}
	}
}
