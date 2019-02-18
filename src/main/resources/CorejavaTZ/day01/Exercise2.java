package com.corejava.day01;

import java.util.Scanner;

/**
	动感地带	16 + 0.2 * min
	神州行		0.6 * min
	
	请您输入每月电话分钟数:60
	
	神州行:xxx
	动感地带:xxx
	选择:xxx更加合算.
*/
public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入每月电话分钟数:");
		int min = sc.nextInt();
		double dgdd = 16 + 0.2 * min;
		double szx = 0.6 * min;
		System.out.println("动感地带需要花费:" + dgdd + "元.");
		System.out.println("神州行需要花费:" + szx + "元.");

		//System.out.println(dgdd >= szx ? "神州行" : "动感地带");

		if (dgdd < szx) {
			System.out.println("动感地带");
		} else if (dgdd > szx) {
			System.out.println("神州行");
		} else {
			System.out.println("随意");
		}
	}
}
