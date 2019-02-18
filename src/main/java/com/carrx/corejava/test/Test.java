package com.carrx.corejava.test;

public class Test {
	public static void main(String[] args) {
		gdp(131735.85, 0.065, 195558.74, 0.025, 12);
	}

	public static void gdp(double cn, double cnlv, double other, double otherlv, int years) {
		double cns = cn * Math.pow(1 + cnlv, years);
		double others = other * Math.pow(1 + otherlv, years);
		System.out.println(cns);
		System.out.println(others);
	}
}
