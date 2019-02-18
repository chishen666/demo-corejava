package com.corejava.day08.abstractclass;


public class TestTravel {
	
	public static void main(String[] args) {
		
		Travel t1 = new Tom();
		t1.topMethod();
		
		Travel t2 = new Jerry();
		t2.topMethod();
	}
}
