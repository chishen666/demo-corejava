package com.corejava.day09.innerclass;

import com.corejava.day09.innerclass.Outer.StaticInner;

/**测试类*/
public class TestOuter {
	public static void main(String[] args) {
		//测试成员内部类

		//公开的成员内部类的测试方式
		//创建成员内部类对象
		//Outer.MemberInner mi = new Outer().new MemberInner();
		//mi.memberInnerMethod();

		//私有化成员内部类的测试方式
		Outer outer = new Outer();
		outer.memberInnerTest();
		
		
		//测试静态内部类
		//Outer.staticInner si = new Outer.staticInner();
		
		//如果静态内部类是公开的话,则可以上升为顶级类,前提是导入
		StaticInner si = new StaticInner();
		si.staticInnerMethod();
		
		
		//测试局部内部类
		outer.outerMethod1();
		
		//测试匿名内部类
		outer.outerMethod2();
	}
}
