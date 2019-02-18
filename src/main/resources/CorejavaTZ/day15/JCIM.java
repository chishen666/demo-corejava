package com.corejava.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 本类用来演示利用Java反射技术获取类的信息
 * 
 * JCMM -- Java Class Information Management
 *
 * 作者:JSD1412
 * 时间:2015-1-23 上午9:50:46
 */
public class JCIM {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("--Java Class Information Management--");
		//	System.out.print("\n请您输入类的全限定名:");
		//String classname = sc.nextLine();
		try {
			//获取类的Class实例(反射第一步)
			Class<?> c = Class.forName("com.corejava.day15.Point");

			//获取类的属性
			//获取类的所有公开属性
			Field[] pubField = c.getFields();

			//获取类的所有属性
			Field[] allField = c.getDeclaredFields();

			//判断是否含有公开属性
			//既有公开,又有私有
			//只有私有属性
			if ((allField.length > pubField.length && pubField.length != 0)
					|| ((pubField.length == 0 && allField.length != 0))) {
				System.out.println("\n**所有属性如下:**");
				for (Field af : allField) {
					printField(af);
				}
				//只有公开属性
			} else if (pubField.length == allField.length) {
				System.out.println("\n**没有私有属性,公开属性如下:**");
				for (Field pf : pubField) {
					printField(pf);
				}
			}

			System.out.println("---------------------------------------------");

			//获取构造方法
			//获取所有的构造方法
			System.out.println("\n**构造方法信息如下:**");
			Constructor<?>[] constructors = c.getDeclaredConstructors();

			for (Constructor<?> constructor : constructors) {
				//System.out.println(constructor);

				printConstructor(constructor);
			}

			System.out.println("---------------------------------------------");

			System.out.println("\n**方法信息如下:**");
			Method[] methods = c.getDeclaredMethods();

			for (Method method : methods) {
				//System.out.println(method);
				printMethod(method);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("对不起,类名输入有误!");
		}
	}

	/**
	 * 专门用来打印属性的方法
	 */
	public static void printField(Field field) {
		//修饰符
		String mod = Modifier.toString(field.getModifiers());
		System.out.print(mod + " ");

		//类型
		String type = field.getType().getName();
		System.out.print(lastPart(type) + " ");
		//属性名
		String name = field.getName();
		System.out.println(name + ";");
	}

	/**
	 * 专门用来打印构造方法的方法
	 */
	public static void printConstructor(Constructor<?> constructor) {
		//修饰符
		String mod = Modifier.toString(constructor.getModifiers());
		System.out.print(mod + " ");

		//方法名
		String name = constructor.getName();
		System.out.print(lastPart(name) + "(");

		//参数列表
		Class<?>[] paramTypes = constructor.getParameterTypes();

		for (int i = 0; i < paramTypes.length; i++) {
			System.out.print(i == paramTypes.length - 1 ? paramTypes[i]
					.getName() : paramTypes[i].getName() + ",");
		}
		System.out.println(")");
	}

	/**
	 * 专门用来打印方法信息的方法
	 */
	public static void printMethod(Method method) {
		//修饰符
		System.out.print(Modifier.toString(method.getModifiers()) + " ");
		//返回类型
		System.out.print(lastPart(method.getReturnType().getName()) + " ");
		//方法名
		System.out.print(method.getName() + "(");
		//参数列表
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
	 * 截取名字最后的部分
	 */
	public static String lastPart(String name) {
		return name.substring(name.lastIndexOf(".") + 1);
	}
}
