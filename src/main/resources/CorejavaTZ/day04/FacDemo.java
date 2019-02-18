package com.corejava.day04;

/**
 * 本类用来演示Java递归算法
 *
 * 作者:JSD1412
 * 时间:2015-1-7 下午4:23:36
 */
public class FacDemo {
	public static void main(String[] args) {
		//System.out.println(fac(10));
		System.out.println(feibo(5));
	}

	//递归算法
	public static long fac(int num) {
		//递归出口,也就是递归结束的条件,如果不指定退出条件,则
		//抛出堆栈溢出错误:java.lang.StackOverflowError;
		if (num == 1) {
			return 1;
		}
		return num * fac(num - 1);
	}

	/**
	 * 传入指定位置,确定此位置上的斐波那契数字是多少
	 */
	public static long feibo(int pos) {
		if(pos == 1 || pos == 2){
			return 1;
		}
		return feibo(pos - 1) + feibo(pos - 2);
	}
}
