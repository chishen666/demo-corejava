package com.corejava.day08.interfaces;

/**交通工具抽象父类*/
public abstract class Vehicle implements Movable {

	//把方向转换成对应的字符串
	public String getDirection(int dir) {
		String s = null;
		if (dir == 1) {
			s = "东";
		} else if (dir == 2) {
			s = "西";
		} else if (dir == 3) {
			s = "北";
		} else if (dir == 4) {
			s = "南";
		} else {
			s = "北";
		}
		return s;
	}
}
