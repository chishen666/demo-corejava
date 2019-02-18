package com.corejava.day08.abstractclass;

public class Tom extends Travel{

	@Override
	public void go() {
		System.out.println("专机接送");
	}

	@Override
	public void play() {
		System.out.println("XXX五天四夜豪华游");
	}

	@Override
	public void back() {
		System.out.println("专机接回");
	}
}
