package com.corejava.day03;

/**
 * ����������ʾbreak��continue
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����5:00:48
 */
public class BreakContinueDemo {

	public static void main(String[] args) {

		/*for (int i = 0; i < 10; i++) {
			if (i == 5) {
				//break;//�������ѭ��
				continue;//��ϱ���ѭ��,����ִ����һ��
			}
			System.out.println(i);
		}*/

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break;
					//System.exit(0);//�ж�JVM����
				}
				System.out.println(i + ":" + j);
			}
		}
	}
}
