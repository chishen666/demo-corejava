package com.corejava.day03;

/**
 * ����������ʾJava Whileѭ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����2:16:44
 */
public class WhileDemo {
	public static void main(String[] args) {

		int i = 0;

		/*while (i < 10) {
			System.out.println(i++);
		}*/

		/*while (true) {
			System.out.println(i++);
			
			//ѭ���˳�����
			if (i == 10) {
				break;//���
			}
		}*/

		//��ѭ��
		/*while(true){
			System.out.println(i++);
		}*/

		do {
			System.out.println(i++);
		} while (i < 10);
	}
}
