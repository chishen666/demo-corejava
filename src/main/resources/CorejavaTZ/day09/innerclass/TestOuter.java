package com.corejava.day09.innerclass;

import com.corejava.day09.innerclass.Outer.StaticInner;

/**������*/
public class TestOuter {
	public static void main(String[] args) {
		//���Գ�Ա�ڲ���

		//�����ĳ�Ա�ڲ���Ĳ��Է�ʽ
		//������Ա�ڲ������
		//Outer.MemberInner mi = new Outer().new MemberInner();
		//mi.memberInnerMethod();

		//˽�л���Ա�ڲ���Ĳ��Է�ʽ
		Outer outer = new Outer();
		outer.memberInnerTest();
		
		
		//���Ծ�̬�ڲ���
		//Outer.staticInner si = new Outer.staticInner();
		
		//�����̬�ڲ����ǹ����Ļ�,���������Ϊ������,ǰ���ǵ���
		StaticInner si = new StaticInner();
		si.staticInnerMethod();
		
		
		//���Ծֲ��ڲ���
		outer.outerMethod1();
		
		//���������ڲ���
		outer.outerMethod2();
	}
}
