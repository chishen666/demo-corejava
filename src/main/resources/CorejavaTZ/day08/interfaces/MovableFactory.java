package com.corejava.day08.interfaces;

/**������*/

//����ӿڱ��*/
public class MovableFactory implements IConstants {

	//�����Ĳ����б�д�ɽӿ�
	public static Movable getInstance(int type) {
		if (type == BIKE) {
			return new Bike();
		} else if (type == CAR) {
			return new Car();
		} else if (type == PLANE) {
			return new Plane();
		} else {
			throw new IllegalArgumentException("�Բ���,�������Ϸ�!");
		}
	}
}
