package com.corejava.day08.interfaces;

import static com.corejava.day08.interfaces.IConstants.*;

/**������*/
public class Client {
	public static void main(String[] args) {
		//�������彻ͨ���߶���
		Movable m1 = MovableFactory.getInstance(BIKE);
		Movable m2 = MovableFactory.getInstance(CAR);
		Movable m3 = MovableFactory.getInstance(PLANE);

		//����ҵ�������
		MovableService service = MovableService.getService();

		//���÷���
		Movable[] movables = new Movable[3];
		movables[0] = m1;
		movables[1] = m2;
		movables[2] = m3;
		
		for(Movable m : movables){
			if(m instanceof ICheckSpeed){
				if(m.getSpeed() > 80){
					System.out.println("�Բ���,��������...");
				}else{
					service.showMessage(m, SOUTH);
				}
			}else{
				service.showMessage(m, SOUTH);
			}
		}
	}
}
