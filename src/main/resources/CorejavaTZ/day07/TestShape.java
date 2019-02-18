package com.corejava.day07;

//静态导入 -- 导入ShapeFactory类中所有的静态成员
import static com.corejava.day07.ShapeFactory.*;

public class TestShape {
	public static void main(String[] args) {

		//面向父类编程--对象的编译时类型写成父类

		//Shape c = new Circle(3.0);

		//通过工厂创建具体的形状
		//Shape c = ShapeFactory.getInstance(1);

		//Shape r = new Rect(2, 3);
		//Shape r = ShapeFactory.getInstance(2);

		//加入常量,提高可读性
		//Shape c = ShapeFactory.getInstance(ShapeFactory.CIRCLE);
		//Shape r = ShapeFactory.getInstance(ShapeFactory.RECT);

		//合成
		//Shape s = ShapeFactory.getInstance(ShapeFactory.RECT);

		//加入静态导入的最终版本:
		Shape s = getInstance(CIRCLE);
		
		//创建业务类对象
		//ShapeService ss = new ShapeService();
		
		ShapeService ss = ShapeService.getInstance();

		ss.printArea(s);
	}
}
