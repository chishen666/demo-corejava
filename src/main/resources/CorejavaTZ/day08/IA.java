package com.corejava.day08;

/**�ӿ�*/

//ע��:�ӿ�Ҳ����,��������ɺ�Ҳ������ֽ����ļ�

//�ӿ�֮������໥�̳�,���һ�֧�ֶ�̳�
public interface IA extends IB,IC{
	//����
	//private int id;
	
	//�ӿ������е����Ա����ǹ�����̬�ĳ�������
	//public static final int A = 1;
	
	//���ڽӿ������е����Զ��ǹ�����̬�ĳ���,���Կ��Լ�д��:
	int A = 1;
	
	
	//�ӿ��в��ܺ��й��췽��,���Խӿڲ��ܱ�ʵ����
	/*public IA(){
		
	}*/
	
	//�ӿ��в��ܺ���ʵ�ֵķ���,�����ǳ��󷽷�
	/*public void method(){
		
	}*/
	
	//���󷽷����Լ�д��:
	//public abstract void method();
	
	void methodA();
}
