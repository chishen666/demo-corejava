package com.corejava.day10;

/**
 * 本类用来演示Java包装类字符型
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午4:07:37
 */
public class CharacterDemo {
	public static void main(String[] args) {
		//判断指定字符是否是数字
		System.out.println(Character.isDigit('9'));

		//判断指定字符是否是字母(只要是语言的基本组成单位都是字母)
		System.out.println(Character.isLetter('ひ'));

		//判断指定字符是否是空白
		System.out.println(Character.isWhitespace(' '));

		//判断指定字符是否是大写字母
		System.out.println(Character.isUpperCase('A'));

		//判断指定字符是否是小写字母
		System.out.println(Character.isLowerCase('a'));

		//把指定字符转换成大写形式
		System.out.println(Character.toUpperCase('a'));

		//把指定字符转换成小写形式
		System.out.println(Character.toLowerCase('A'));
	}
}
