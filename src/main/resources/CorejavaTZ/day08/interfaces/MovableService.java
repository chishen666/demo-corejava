package com.corejava.day08.interfaces;

/**业务类*/
public class MovableService {

	private static MovableService ms = new MovableService();

	private MovableService() {

	}

	public static MovableService getService() {
		return ms;
	}
	
	//业务方法
	//面向接口编程,方法的参数列表写成接口
	public void showMessage(Movable m,int dir){
		m.run(dir);
	}
}
