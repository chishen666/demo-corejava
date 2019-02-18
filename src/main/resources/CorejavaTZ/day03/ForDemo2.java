package com.corejava.day03;

/**
 * 本类用来演示for循环双层嵌套
 *
 * 作者:JSD1412
 * 时间:2015-1-6 下午3:41:17
 */
public class ForDemo2 {
	public static void main(String[] args) {

		//内外层没有联系
		/*for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " : " + j);
			}
		}*/
		
		//内外层有联系
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(i + " : " + j);
			}
		}
	}
}
