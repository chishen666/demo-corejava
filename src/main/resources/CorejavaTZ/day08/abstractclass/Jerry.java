package com.corejava.day08.abstractclass;


public class Jerry extends Travel{

	@Override
	public void go() {
		System.out.println("做绿皮火车");
	}

	@Override
	public void play() {
		System.out.println("学校操场半日游");
	}

	@Override
	public void back() {
		System.out.println("走路回宿舍");
	}

}
