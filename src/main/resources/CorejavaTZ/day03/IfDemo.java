package com.corejava.day03;

/**
 * 本类用来演示Java条件判断
 *
 * 作者:JSD1412
 * 时间:2015-1-6 下午1:37:31
 */
public class IfDemo {
	
	public static void main(String[] args) {
		int score = 78;
		if (score < 0 || score > 100) {

			System.out.println("分数不合法!");
		} else {
			if (score < 60) {
				System.out.println("不及格");
			} else if (score < 80) {
				System.out.println("及格");
			} else if (score < 90) {
				System.out.println("良好");
			} else {
				System.out.println("优秀");
			}
		}
	}
}
