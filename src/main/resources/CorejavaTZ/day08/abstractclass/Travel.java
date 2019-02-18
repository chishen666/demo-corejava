package com.corejava.day08.abstractclass;

/**
 * 本类用来演示Java模板设计模式
 *
 * 作者:JSD1412
 * 时间:2015-1-14 上午10:52:27
 */

//旅游模板类
public abstract class Travel {

	//1.定义旅游所需要的所有步骤

	//去
	public abstract void go();

	//玩
	public abstract void play();

	//回
	public abstract void back();

	//2.提供一个顶级业务流程方法,按照一定的顺序执行以上三个方法
	public final void topMethod() {
		//...
		go();
		//...
		play();
		//...
		back();
		//...
	}
}
