package com.corejava.day05.homework;

public class TestComputer {
	public static void main(String[] args) {
		Computer c = new Computer("����", 40000, "����һ̨�ʼǱ�����", new Screen("LED",
				26, "����"));
		c.outputComputerInfo();
	}
}
