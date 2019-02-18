package com.corejava.util;

import java.util.Arrays;

/**
 * ����������ʾJava����ĳ�������
 *
 * ����:JSD1412
 * ʱ��:2015-1-8 ����11:08:35
 */
public class ArrayUtil {

	/**
	 * �ҳ�����������Ԫ��
	 * @throws ArrayNotNullException 
	 */
	public static int getMaxElement(int[] arr) throws ArrayNotNullException {
		//�ǿ��ж�
		if (arr == null) {
			throw new ArrayNotNullException();
		}
		//�����һ��Ԫ�������ֵ
		int max = arr[0];
		//�ӵڶ���Ԫ�ؿ�ʼ����ѭ������Ƚ�
		for (int i = 1; i < arr.length; i++) {
			//�������Ԫ�ر�max����,�򸲸�max
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * �ҳ���������С��Ԫ��
	 */
	public static int getMinElement(int[] arr) {
		//�ǿ��ж�
		if (arr != null) {
			//�����һ��Ԫ������Сֵ
			int min = arr[0];
			//�ӵڶ���Ԫ�ؿ�ʼ����ѭ������Ƚ�
			for (int i = 1; i < arr.length; i++) {
				//�������Ԫ�ر�min��С��,�򸲸�min
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
		return 0;
	}

	/**
	 * ������ָ��λ�����ָ��ֵ
	 */
	public static int[] insertElement(int[] src, int index, int value) {
		//�ǿ��ж�
		if (src == null) {
			return null;
		}
		//�±겻�Ϸ�,ֱ�ӷ���ԭ����
		if (index < 0 || index > src.length - 1) {
			return src;
		}
		//����������,����Ϊԭ����+1
		int[] temp = new int[src.length + 1];

		//�ֶ�
		//index֮ǰ,һ��һ��ͬλ�ø�ֵ
		for (int i = 0; i < index; i++) {
			temp[i] = src[i];
		}
		//index��
		temp[index] = value;

		//index֮��
		for (int i = index; i < src.length; i++) {
			temp[i + 1] = src[i];
		}
		return temp;
	}

	/**
	 * ��С������������Ԫ��
	 */
	public static int[] sortMinToMax(int[] arr) {
		if (arr == null) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					//�����������ԭֵ
					int temp = arr[i];
					//����λ��
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * �Ӵ�С��������Ԫ��
	 */
	public static int[] sortMaxToMin(int[] arr) {
		if (arr == null) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					//�����������ԭֵ
					int temp = arr[i];
					//����λ��
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * �����±�ɾ������Ԫ��
	 */
	public static int[] deleteElementByIndex(int[] arr, int index) {
		if (arr == null) {
			return null;
		}
		if (index < 0 || index >= arr.length) {
			return arr;
		}
		//�˴�˵������һ������ɾ��һ��Ԫ��
		int[] temp = new int[arr.length - 1];
		//������������±�
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				temp[idx++] = arr[i];
			}
		}
		return temp;
	}

	/**
	 * ����Ԫ��ɾ��Ԫ��
	 */
	public static int[] deleteElementByTarget(int[] arr, int element) {
		if (arr == null) {
			return null;
		}
		//�ж��������м���element
		int count = 0;//������
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		//�½�����,����Ϊԭ����-count
		int[] temp = new int[arr.length - count];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				temp[idx++] = arr[i];
			}
		}
		return temp;
	}

	/**
	 * ȥ�������е��ظ�Ԫ��
	 */
	public static int[] clearDoubleElement(int[] arr) {
		//�½�����������ԭ������ͬ
		int[] temp = new int[arr.length];
		int idx = 0;
		for (;;) {
			temp[idx++] = arr[0];
			arr = deleteElementByTarget(arr, arr[0]);
			//���鳤�����Ϊ0,˵��Ԫ�ض��Ѿ�ɾ��,���˳�ѭ��
			if (arr.length == 0) {
				break;
			}
		}
		temp = Arrays.copyOf(temp, idx);
		return temp;
	}
}
