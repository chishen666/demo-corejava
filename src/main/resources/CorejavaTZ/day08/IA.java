package com.corejava.day08;

/**接口*/

//注意:接口也是类,它编译完成后也会产生字节码文件

//接口之间可以相互继承,而且还支持多继承
public interface IA extends IB,IC{
	//属性
	//private int id;
	
	//接口中所有的属性必须是公开静态的常量属性
	//public static final int A = 1;
	
	//由于接口中所有的属性都是公开静态的常量,所以可以简写成:
	int A = 1;
	
	
	//接口中不能含有构造方法,所以接口不能被实例化
	/*public IA(){
		
	}*/
	
	//接口中不能含有实现的方法,必须是抽象方法
	/*public void method(){
		
	}*/
	
	//抽象方法可以简写成:
	//public abstract void method();
	
	void methodA();
}
