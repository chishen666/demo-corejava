package com.corejava.day05.homework;

public class TestComputer {
	public static void main(String[] args) {
		Computer c = new Computer("联想", 40000, "这是一台笔记本电脑", new Screen("LED",
				26, "三星"));
		c.outputComputerInfo();
	}
}
