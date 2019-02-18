package com.corejava.day04;

import java.util.Arrays;

/**
 * 本类用来演示Java数组的定义,赋值,遍历
 *
 * 作者:JSD1412
 * 时间:2015-1-8 上午10:20:37
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//创建数组
		int[] arr1 = new int[5];//数组的长度必须要有,且一旦确定,是不可以改变的
		int arr2[] = new int[5];

		String[] arr3 = new String[3];

		String[] arr4;
		arr4 = new String[5];

		//通过数组名.length来获取数组的长度
		System.out.println(arr1.length);

		//通过下标访问数组元素
		System.out.println(arr1[2]);//访问数组arr1的第三个元素

		//访问数组时,如果下标超过范围,则抛出数组下标越界异常:java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(arr1[5]);//运行抛出异常

		//数组元素的赋值

		//1.创建数组的同时直接赋值(自定义小数据容器)
		int[] arr5 = { 2, 7, 4, 7, 1 };
		//完全等价于
		int[] arr6 = new int[] { 2, 7, 4, 7, 1 };//此写法[]中不能写长度了

		//2.for循环赋值(自定义数据容器,并且数据是有规律或者任意随机)
		int[] arr7 = new int[10];
		for (int i = 0; i < arr7.length; i++) {//循环数组下标范围
			//arr7[i] = i + 1;

			arr7[i] = (int) (Math.random() * 10 + 1);//随机
		}

		//3.java.util.Arrays数组工具类,fill(...),填充方法
		//Arrays.fill(arr4, "Java");//赋值数组中所有的元素
		Arrays.fill(arr4, 1, 3, "Java");//赋值指定范围内的元素(前闭后开)

		//4.通过下标一一赋值(一般用在修改某个值)
		/*arr1[0] = 5;
		arr1[1] = 3;
		arr1[2] = 7;*/

		//数组元素的遍历,也叫做迭代
		//1.java.util.Arrays数组工具类中的toString(数组名)方法,把数组转换成指定格式的字符串
		//[e1, e2, e3 ,....]
		System.out.println(Arrays.toString(arr4));

		//2.普通for循环
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		//3.增强for循环,JDK5.0开始
		//a.书写简便
		//b.可以遍历无序
		for (String s : arr4) {
			System.out.println(s);
		}

		//4.通过下标一一打印
		/*System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		...*/

		//5.自定义输出方法
		printArray(arr5);
	}

	/**
	 * 打印数组的自定义方法
	 */
	public static void printArray(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
		}
		System.out.println("}");
	}

}
