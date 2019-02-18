package com.corejava.day08.homework2;

public interface Player {
	String BU = "布"; //布
	String JIANDAO = "剪刀"; //剪刀
	String SHITOU = "石头"; //石头

	String getName(); //得以参与者的姓名

	String show(); //决定出什么手势, 返回本接口的三个常量之一
}
