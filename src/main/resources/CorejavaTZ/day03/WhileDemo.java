package com.corejava.day03;

/**
 * 本类用来演示Java While循环
 *
 * 作者:JSD1412
 * 时间:2015-1-6 下午2:16:44
 */
public class WhileDemo {
	public static void main(String[] args) {

		int i = 0;

		/*while (i < 10) {
			System.out.println(i++);
		}*/

		/*while (true) {
			System.out.println(i++);
			
			//循环退出条件
			if (i == 10) {
				break;//打断
			}
		}*/

		//死循环
		/*while(true){
			System.out.println(i++);
		}*/

		do {
			System.out.println(i++);
		} while (i < 10);
	}
}
