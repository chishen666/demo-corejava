package com.corejava.day12;

/**性别枚举*/
public enum Gender {
	
	//枚举常量,也叫做枚举值,它们都是类型安全的
	//不同枚举值之间用,隔开
	MALE,
	//相当于
	//public static final Gender MALE = new Gender();
	//public static final Gender FEMALE = new Gender();
	
	FEMALE;//最后一个枚举值以;结束,如果后面没有其他代码,则此;可以省略
	
	//枚举中可以有普通属性
	//private int id;
	
	//枚举中可以有构造方法,但是必须是私有化的
	//所以,枚举不能通过外接创建对象
	/*private Gender() {
		
	}*/
	
	//枚举中可以有普通方法
	/*public void method(){
		
	}*/
	
	//枚举中可以有抽象方法,但是必须要让每个枚举常量都实现该抽象方法
	//public abstract void method();
	
}
