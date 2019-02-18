package com.corejava.day03;

/**
 * 本类用来演示break和continue
 *
 * 作者:JSD1412
 * 时间:2015-1-6 下午5:00:48
 */
public class BreakContinueDemo {

	public static void main(String[] args) {

		/*for (int i = 0; i < 10; i++) {
			if (i == 5) {
				//break;//打断整个循环
				continue;//打断本次循环,继续执行下一次
			}
			System.out.println(i);
		}*/

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break;
					//System.exit(0);//中断JVM进程
				}
				System.out.println(i + ":" + j);
			}
		}
	}
}
