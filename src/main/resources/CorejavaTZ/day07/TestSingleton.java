package com.corejava.day07;

public class TestSingleton {
	public static void main(String[] args) {

		//ֻҪnew��˵�������¿ռ�,������¶���
		//SingletonDemo s1 = new SingletonDemo();
		//SingletonDemo s2 = new SingletonDemo();
		
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();

		//�Ƚ϶����ڴ��ַ�Ƿ���ͬ
		System.out.println(s1 == s2);
	}
}
