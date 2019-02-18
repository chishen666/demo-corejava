package com.carrx.corejava.nestedclass;

public class NestedClassDemo {
	public static void main(String[] args) {
		// 成员内部类
		OuterClass outer = new OuterClass();
		outer.memberTest();

		OuterClass.MemberClass member = new OuterClass().new MemberClass();
		member.test();

		// 静态内部类
		outer.staticTest();

		OuterClass.StaticClass sta = new OuterClass.StaticClass();
		sta.test();
	}
}
