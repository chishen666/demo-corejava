package com.corejava.day07;

/**
 * 本类用来演示final关键字
 *
 * 作者:JSD1412
 * 时间:2015-1-13 下午4:36:50
 */
//final修饰类表示这个类不能被继承
public final class FinalDemo {

	//常量用来提高代码的可读性

	//常量属性
	//public static final int ROW_EACH_PAGE = 10;
	public static final int ROW_EACH_PAGE;

	//常量属性通过静态代码块初始化
	static {
		ROW_EACH_PAGE = 10;
	}

	public static void main(String[] args) {

		//常量一旦赋值,无法改变
		final int ROWS = 3;
		//ROWS = 10;
	}

	//final修饰方法,表示这个方法不能被重写
	public final void method() {

	}
}

/*class Test extends FinalDemo {
	@Override
	public void method() {
		super.method();
	}
}*/
