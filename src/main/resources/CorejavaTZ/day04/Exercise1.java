package com.corejava.day04;

/**
 * ����һ��5�����ȵ����ֺ���,ÿһλ����0-9֮�������,
 * �˴˲����ظ�
 */
public class Exercise1 {
	public static void main(String[] args) {
		//����10����λ����������
		int[] arr = new int[10];
		//��ʼ������,0-9һ��10������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		//���ѭ��
		for (int i = 0; i < 5;) {
			//���������±�
			int index = (int) (Math.random() * 10);
			//ͨ���±��ȡ����Ԫ��
			int element = arr[index];
			//�ж�Ԫ���Ƿ�Ϊ-1,�����-1,˵����Ԫ��֮ǰ����ȥ��
			if (element == -1) {
				continue;//��������,����ע��,������,����������1��
			}
			//�������-1,˵��֮ǰû�б���ȡ��,��ֱ�Ӵ�ӡ����
			System.out.print(element + " ");
			//�Ѵ�ӡ���������Ԫ�ر��-1;
			arr[index] = -1;
			//��������1��
			i++;
		}
	}
}
