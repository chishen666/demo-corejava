package com.corejava.day06;

public class TestAnimal {
	public static void main(String[] args) {
		Cat c1 = new Cat("波斯猫", "喵喵", 99.99);
		System.out.println(c1.getType());
		System.out.println(c1.getName());
		System.out.println(c1.getMeng());
		
		//调用公共方法
		c1.eat();
		
		//调用特有方法
		c1.catchMouse();

		Dog d1 = new Dog("金毛", "旺财", 99.99);
		System.out.println(d1.getType());
		System.out.println(d1.getName());
		System.out.println(d1.getLoyal());

		d1.eat();
		d1.watchDoor();

		//多态演示
		Animal a1 = new Cat("波斯猫", "喵喵", 99.99);
		Animal a2 = new Dog("金毛", "旺财", 99.99);

		a1.eat();
		a2.eat();

		//调用特有方法的方式
		Animal[] animals = new Animal[2];
		animals[0] = a1;
		animals[1] = a2;
		for (Animal a : animals) {
			//在做类型转换之前,要先做类型一致性判断
			//否则可能出现转换异常:java.lang.ClassCastException
			if (a instanceof Cat) {
				Cat cc = (Cat) a;
				cc.catchMouse();
			}
			if (a instanceof Dog) {
				Dog dd = (Dog) a;
				dd.watchDoor();
			}
		}
		
		System.out.println("------------------------");
		
		System.out.println(c1 instanceof Cat);
		System.out.println(d1 instanceof Dog);
		System.out.println(a1 instanceof Cat);
		System.out.println(a2 instanceof Cat);
		System.out.println(c1 instanceof Animal);
		System.out.println(d1 instanceof Animal);
	}
}
