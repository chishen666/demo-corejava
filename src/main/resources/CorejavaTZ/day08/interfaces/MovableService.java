package com.corejava.day08.interfaces;

/**ҵ����*/
public class MovableService {

	private static MovableService ms = new MovableService();

	private MovableService() {

	}

	public static MovableService getService() {
		return ms;
	}
	
	//ҵ�񷽷�
	//����ӿڱ��,�����Ĳ����б�д�ɽӿ�
	public void showMessage(Movable m,int dir){
		m.run(dir);
	}
}
