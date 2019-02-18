package com.corejava.day09.innerclass;

import java.util.Arrays;

/**�ⲿ��*/
public class Outer {
	//�ⲿ�������
	private int id = 1;
	private static int guid = 10;

	private String[] names = { "Jack", "Rose", "Tom", "Mary" };

	//�ⲿ��Ĺ��췽��
	public Outer() {

	}

	//�����Ա�ڲ���
	//public class MemberInner {

	//һ��,���ǰѳ�Ա�ڲ�������˽�л���
	private class MemberInner {
		//�ڲ��������
		private int id = 2;

		//�ڲ���ķ���
		//��Ա�ڲ�����Է����ⲿ�����еĳ�Ա
		public void memberInnerMethod() {
			System.out.println("�ⲿ���id = " + Outer.this.id);
			System.out.println("�ڲ����id = " + id);
			System.out.println(guid);
			System.out.println(Arrays.toString(names));
		}
	}

	//�ṩһ������������Ա�ڲ�������ҵ��÷���
	public void memberInnerTest() {
		MemberInner mi = new MemberInner();
		mi.memberInnerMethod();
	}

	//��̬�ڲ���
	public static class StaticInner {

		//��̬�ڲ���ֻ�ܷ�����羲̬��Ա
		public void staticInnerMethod() {
			//System.out.println(id);
			System.out.println(guid);
			//System.out.println(Arrays.toString(names));
		}
	}

	public void outerMethod1() {

		//����ֲ��ڲ���
		class LocalInner {
			//����
			private int id = 3;

			//����
			public void localInnerMethod() {
				System.out.println(id);
				System.out.println(Outer.this.id);
				System.out.println(guid);
				System.out.println(Arrays.toString(names));
			}
		}
		//�����ֲ��ڲ������
		LocalInner li = new LocalInner();
		li.localInnerMethod();
	}

	public void outerMethod2() {
		//���������ڲ���
		new Printable() {
			@Override
			public void method() {
				System.out.println(Arrays.toString(names));
			}
		}.method();
	}
}
