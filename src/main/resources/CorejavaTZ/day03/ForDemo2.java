package com.corejava.day03;

/**
 * ����������ʾforѭ��˫��Ƕ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����3:41:17
 */
public class ForDemo2 {
	public static void main(String[] args) {

		//�����û����ϵ
		/*for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " : " + j);
			}
		}*/
		
		//���������ϵ
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(i + " : " + j);
			}
		}
	}
}
