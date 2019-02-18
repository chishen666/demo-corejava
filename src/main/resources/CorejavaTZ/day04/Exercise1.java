package com.corejava.day04;

/**
 * 产生一个5个长度的数字号码,每一位都是0-9之间的整数,
 * 彼此不能重复
 */
public class Exercise1 {
	public static void main(String[] args) {
		//创建10个单位的容器数组
		int[] arr = new int[10];
		//初始化容器,0-9一共10个数字
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		//五次循环
		for (int i = 0; i < 5;) {
			//随机数组的下标
			int index = (int) (Math.random() * 10);
			//通过下标获取数组元素
			int element = arr[index];
			//判断元素是否为-1,如果是-1,说明该元素之前被抽去过
			if (element == -1) {
				continue;//跳过本轮,但是注意,跳过后,次数不能算1次
			}
			//如果不是-1,说明之前没有被抽取过,则直接打印出来
			System.out.print(element + " ");
			//把打印过后的数组元素变成-1;
			arr[index] = -1;
			//次数计算1次
			i++;
		}
	}
}
