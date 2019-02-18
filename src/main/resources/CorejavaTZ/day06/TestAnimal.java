package com.corejava.day06;

public class TestAnimal {
	public static void main(String[] args) {
		Cat c1 = new Cat("��˹è", "����", 99.99);
		System.out.println(c1.getType());
		System.out.println(c1.getName());
		System.out.println(c1.getMeng());
		
		//���ù�������
		c1.eat();
		
		//�������з���
		c1.catchMouse();

		Dog d1 = new Dog("��ë", "����", 99.99);
		System.out.println(d1.getType());
		System.out.println(d1.getName());
		System.out.println(d1.getLoyal());

		d1.eat();
		d1.watchDoor();

		//��̬��ʾ
		Animal a1 = new Cat("��˹è", "����", 99.99);
		Animal a2 = new Dog("��ë", "����", 99.99);

		a1.eat();
		a2.eat();

		//�������з����ķ�ʽ
		Animal[] animals = new Animal[2];
		animals[0] = a1;
		animals[1] = a2;
		for (Animal a : animals) {
			//��������ת��֮ǰ,Ҫ��������һ�����ж�
			//������ܳ���ת���쳣:java.lang.ClassCastException
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
