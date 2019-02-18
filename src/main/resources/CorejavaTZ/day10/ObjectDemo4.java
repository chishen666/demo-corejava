package com.corejava.day10;

/**
 * ����������ʾjava.lang.Object��clone()����
 * 
 * Ҫ��:
 * 1.��дclone()����,�����η���protected�ĳ�public
 * 2.����¡�Ķ������ʵ�ֿ�¡��ǽӿ�:java.lang.Cloneable,������׳�
 *   ��¡��֧���쳣:java.lang.CloneNotSupportedException
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����1:55:33
 */
public class ObjectDemo4 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sherlock", new Clazz(10, "AA"));

		try {
			Student s2 = (Student) s1.clone();

			//֤�������ĵײ�ԭ��:
			//ǳ�㸴��,�������Ϳ���һ��,�������͹���
			//��㸴��,�κ����Ͷ�����һ�ݸ��¶���
			
			//1.��������(�����������,Date��String)��ֱ�ӿ���һ�ݸ��¶���
			s1.setName("Holmes");
			System.out.println(s2.getName());
			
			//2.���������ǹ����
			s1.getClazz().setCap(20);
			System.out.println(s2.getClazz().getCap());
			
			//����:Object�е�clone()����Ĭ�Ͼ���ǳ�㸴��,Ϊ�˽��ͳ������Դ����,�������

		} catch (CloneNotSupportedException e) {
			//e.printStackTrace();
			System.err.println("����֧�ֿ�¡...");
		}
	}
}
