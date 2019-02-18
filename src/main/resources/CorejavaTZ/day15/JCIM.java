package com.corejava.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * ����������ʾ����Java���似����ȡ�����Ϣ
 * 
 * JCMM -- Java Class Information Management
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����9:50:46
 */
public class JCIM {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("--Java Class Information Management--");
		//	System.out.print("\n�����������ȫ�޶���:");
		//String classname = sc.nextLine();
		try {
			//��ȡ���Classʵ��(�����һ��)
			Class<?> c = Class.forName("com.corejava.day15.Point");

			//��ȡ�������
			//��ȡ������й�������
			Field[] pubField = c.getFields();

			//��ȡ�����������
			Field[] allField = c.getDeclaredFields();

			//�ж��Ƿ��й�������
			//���й���,����˽��
			//ֻ��˽������
			if ((allField.length > pubField.length && pubField.length != 0)
					|| ((pubField.length == 0 && allField.length != 0))) {
				System.out.println("\n**������������:**");
				for (Field af : allField) {
					printField(af);
				}
				//ֻ�й�������
			} else if (pubField.length == allField.length) {
				System.out.println("\n**û��˽������,������������:**");
				for (Field pf : pubField) {
					printField(pf);
				}
			}

			System.out.println("---------------------------------------------");

			//��ȡ���췽��
			//��ȡ���еĹ��췽��
			System.out.println("\n**���췽����Ϣ����:**");
			Constructor<?>[] constructors = c.getDeclaredConstructors();

			for (Constructor<?> constructor : constructors) {
				//System.out.println(constructor);

				printConstructor(constructor);
			}

			System.out.println("---------------------------------------------");

			System.out.println("\n**������Ϣ����:**");
			Method[] methods = c.getDeclaredMethods();

			for (Method method : methods) {
				//System.out.println(method);
				printMethod(method);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("�Բ���,������������!");
		}
	}

	/**
	 * ר��������ӡ���Եķ���
	 */
	public static void printField(Field field) {
		//���η�
		String mod = Modifier.toString(field.getModifiers());
		System.out.print(mod + " ");

		//����
		String type = field.getType().getName();
		System.out.print(lastPart(type) + " ");
		//������
		String name = field.getName();
		System.out.println(name + ";");
	}

	/**
	 * ר��������ӡ���췽���ķ���
	 */
	public static void printConstructor(Constructor<?> constructor) {
		//���η�
		String mod = Modifier.toString(constructor.getModifiers());
		System.out.print(mod + " ");

		//������
		String name = constructor.getName();
		System.out.print(lastPart(name) + "(");

		//�����б�
		Class<?>[] paramTypes = constructor.getParameterTypes();

		for (int i = 0; i < paramTypes.length; i++) {
			System.out.print(i == paramTypes.length - 1 ? paramTypes[i]
					.getName() : paramTypes[i].getName() + ",");
		}
		System.out.println(")");
	}

	/**
	 * ר��������ӡ������Ϣ�ķ���
	 */
	public static void printMethod(Method method) {
		//���η�
		System.out.print(Modifier.toString(method.getModifiers()) + " ");
		//��������
		System.out.print(lastPart(method.getReturnType().getName()) + " ");
		//������
		System.out.print(method.getName() + "(");
		//�����б�
		Class<?>[] paramTypes = method.getParameterTypes();
		for (int i = 0; i < paramTypes.length; i++) {
			System.out
					.print(i == paramTypes.length - 1 ? lastPart(paramTypes[i]
							.getName()) : lastPart(paramTypes[i].getName()
							+ ","));
		}
		System.out.println(")");

	}

	/**
	 * ��ȡ�������Ĳ���
	 */
	public static String lastPart(String name) {
		return name.substring(name.lastIndexOf(".") + 1);
	}
}
