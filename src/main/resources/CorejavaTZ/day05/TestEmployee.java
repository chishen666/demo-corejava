package com.corejava.day05;

/**������*/
public class TestEmployee {
	public static void main(String[] args) {
		//��������,�������ʵ����һ�������Ա������
		//����������ǵ�����Ӧ�Ĺ��췽��
		Employee e1 = new Employee();

		//���������Ը�ֵ
		/*e1.id = 1;
		e1.name = "Jack";

		//����Ա��������
		System.out.println(e1.id);
		System.out.println(e1.name);

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "Rose";
		System.out.println(e2.id);
		System.out.println(e2.name);*/

		//��ȡ˽������
		System.out.println(e1.getAge());

		//��˽�����Ը�ֵ
		e1.setAge(30);

		e1.setAge(300);

		System.out.println(e1.getAge());

		e1.setName("Jack");
		System.out.println(e1.getName());
		e1.setName("ϰ��ƽ");
		System.out.println(e1.getName());
		
		
		//ͨ�����췽���������Ը�ֵ
		Employee e3 = new Employee(100, "Tom", -32,9000);
		System.out.println(e3.getAge());
	}
}
