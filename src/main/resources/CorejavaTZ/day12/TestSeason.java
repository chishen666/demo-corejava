package com.corejava.day12;

public class TestSeason {
	public static void main(String[] args) {

		System.out.println(Season.WINTER);
		System.out.println(Season.WINTER.toString());

		//获取枚举常量的名称
		System.out.println(Season.WINTER.name());

		Season nextSeason = Season.WINTER.next();
		System.out.println(nextSeason);

		//把当前枚举中所有的枚举常量放入到数组中,API中没有收录
		Season[] seasons = Season.values();
		for (Season s : seasons) {
			System.out.println(s);
		}
	}
}
