package com.corejava.day08.interfaces;

/**工厂类*/

//面向接口编程*/
public class MovableFactory implements IConstants {

	//方法的参数列表写成接口
	public static Movable getInstance(int type) {
		if (type == BIKE) {
			return new Bike();
		} else if (type == CAR) {
			return new Car();
		} else if (type == PLANE) {
			return new Plane();
		} else {
			throw new IllegalArgumentException("对不起,参数不合法!");
		}
	}
}
