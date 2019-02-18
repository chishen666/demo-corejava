package com.corejava.day08.interfaces;

/**移动接口*/
public interface Movable {

	//根据dir确定方向后移动的方法
	void run(int dir);

	//获取速度的方法
	int getSpeed();
}
