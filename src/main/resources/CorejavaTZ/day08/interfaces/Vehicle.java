package com.corejava.day08.interfaces;

/**��ͨ���߳�����*/
public abstract class Vehicle implements Movable {

	//�ѷ���ת���ɶ�Ӧ���ַ���
	public String getDirection(int dir) {
		String s = null;
		if (dir == 1) {
			s = "��";
		} else if (dir == 2) {
			s = "��";
		} else if (dir == 3) {
			s = "��";
		} else if (dir == 4) {
			s = "��";
		} else {
			s = "��";
		}
		return s;
	}
}
