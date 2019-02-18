package com.corejava.day03;

import java.util.Calendar;

public class Exercise2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		int weekday = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(weekday != 1 ? "ĞÇÆÚ" + (weekday - 1) : "ĞÇÆÚÌì");
	}

}
