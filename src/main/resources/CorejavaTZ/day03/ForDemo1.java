package com.corejava.day03;

/**
 * 本类用来演示for循环初级使用
 *
 * 作者:JSD1412
 * 时间:2015-1-6 下午2:28:17
 */
public class ForDemo1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//全部省略,则变成死循环
		/*for(;;){
			System.out.println("A");
		}*/
		
		while(true){
			System.out.println("A");
		}
	}
}
