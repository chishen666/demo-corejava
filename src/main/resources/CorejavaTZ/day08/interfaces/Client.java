package com.corejava.day08.interfaces;

import static com.corejava.day08.interfaces.IConstants.*;

/**测试类*/
public class Client {
	public static void main(String[] args) {
		//创建具体交通工具对象
		Movable m1 = MovableFactory.getInstance(BIKE);
		Movable m2 = MovableFactory.getInstance(CAR);
		Movable m3 = MovableFactory.getInstance(PLANE);

		//创建业务类对象
		MovableService service = MovableService.getService();

		//调用方法
		Movable[] movables = new Movable[3];
		movables[0] = m1;
		movables[1] = m2;
		movables[2] = m3;
		
		for(Movable m : movables){
			if(m instanceof ICheckSpeed){
				if(m.getSpeed() > 80){
					System.out.println("对不起,您超速了...");
				}else{
					service.showMessage(m, SOUTH);
				}
			}else{
				service.showMessage(m, SOUTH);
			}
		}
	}
}
