package com.corejava.day03.homework;

import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args) {
		//�������һ��1~100֮�������
		int randomNum = (int) (Math.random() * 100 + 1);
		System.out.println(randomNum);

		//���巶Χ��ʼ�ͽ���
		int start = 1;
		int end = 100;

		String message = null;//�����С���

		//�����������״̬,״̬����
		boolean bool = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t=====��������Ϸ=====\n\n");
		System.out.print("\t\t��������µ�����(1~100):");
		int input = sc.nextInt();//�û��²������

		for (int i = 1; i <= 5; i++) {
			if (input < start || input > end) {
				System.out.print("\t\t" + message + "��������µ�����[" + start + "~"
						+ end + "]:");
				input = sc.nextInt();
				continue;
			}
			if (input < randomNum) {
				start = input;
				message = "̫С��";
			} else if (input > randomNum) {
				end = input;
				message = "̫����";
			} else {
				System.out.println("\t\t������,������.");
				System.out.println("\n\n\t\t���ɵ��������:" + randomNum + ",��һ���²���["
						+ i + "]��.");
				bool = true;//�ı�״̬������ֵ
				break;
			}
			System.out.print("\t\t" + message + "��������µ�����[" + start + "~" + end
					+ "]:");
			input = sc.nextInt();
			if(i == 5 && input == randomNum){
				System.out.println("\t\t������,������.");
				System.out.println("\n\n\t\t���ɵ��������:" + randomNum + ",��һ���²���["
						+ (i + 1) + "]��.");
				bool = true;//�ı�״̬������ֵ
			}
		}
		if (!bool) {
			System.out.println("\n\n\t\t�Բ���,��û�в���,Game Over!");
		}
	}
}
