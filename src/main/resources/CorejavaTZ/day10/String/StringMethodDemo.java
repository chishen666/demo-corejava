package com.corejava.day10.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 本类用来演示java.lang.String中的常用方法
 *
 * 作者:JSD1412
 * 时间:2015-1-19 上午10:51:57
 */
public class StringMethodDemo {

	private static String str = "你好,我是Java";

	public static void main(String[] args) {
		//1.通过下标获取字符串字符,字符串下标也是从0开始,
		//如果超过下标,则抛出异常:StringIndexOutOfBoundsException
		char c1 = str.charAt(0);
		System.out.println(c1);

		//2.通过正,零,负比较字符串大小(做排序时使用)
		int r1 = new String("C").compareTo(new String("A"));
		System.out.println(r1);

		//3.比较字符串值是否相等
		boolean b1 = new String("C").equals(new String("C"));

		//忽略大小写比较相等
		boolean b2 = new String("C").equalsIgnoreCase(new String("c"));
		System.out.println(b1);
		System.out.println(b2);

		//4.字符串拼接方法
		String s1 = str.concat("程序员");
		System.out.println(s1);

		//5.判断字符串中是否包含指定序列
		boolean b3 = str.contains("C++");
		System.out.println(b3);

		//6.判断字符串是否以指定内容开头或者结尾
		boolean b4 = new String("林忆莲--至少还有你.mp3").startsWith("林忆莲");
		boolean b5 = new String("林忆莲--至少还有你.mp3").endsWith("mp3");
		System.out.println(b4);
		System.out.println(b5);

		//7.获取字符串中指定内容的下标(获取第一次出现的下标)
		//注意:如果不存在指定字符,则返回-1下标
		int index1 = new String("林忆莲--至少还有你.mp3").indexOf("-");
		System.out.println(index1);

		int index2 = new String("林忆莲--至少还有-你.mp3").lastIndexOf("-");
		System.out.println(index2);

		int index3 = new String("林忆莲--至少还有你.mp3").indexOf("-", index1 + 1);
		System.out.println(index3);

		//注意:
		boolean b6 = new String("林忆莲--至少还有你.mp3").startsWith("至少", index3 + 1);
		System.out.println(b6);

		//8.把字符串转换成字节数组(编码转换时使用,以后再说)
		byte[] buf = null;
		try {
			buf = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(buf));
		System.out.println(new String(buf));

		//9.获取字符串的长度(字符数)
		int length1 = str.length();
		System.out.println(length1);

		//获取字符串的长度(字节数)
		int length2 = str.getBytes().length;
		System.out.println(length2);

		//10.判断字符串是否为空
		boolean b7 = str.isEmpty();//容器里面内容为空
		//str = null;//容器不存在
		System.out.println(b7);

		//11.匹配正则表达式
		boolean b8 = new String("ABCD").matches("[A-Z]+");
		System.out.println(b8);

		//12.替换字符串内容
		String s2 = str.replace("Java", "C++");
		System.out.println(s2);

		//13.字符串切割
		String[] strArr = new String("中国-江苏省-苏州市-姑苏区-烽火路80号").split("-");
		System.out.println(Arrays.toString(strArr));

		//14.截取字符串
		String s3 = new String("中国-江苏省-苏州市-姑苏区-烽火路80号").substring(3);
		System.out.println(s3);

		String s4 = new String("中国-江苏省-苏州市-姑苏区-烽火路80号").substring(3, 6);
		System.out.println(s4);

		//15.把字符串转换成字符数组
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));

		//16.把字符串转换成大小写(功能同Character)
		String s5 = new String("ABC").toLowerCase();
		String s6 = new String("abc").toUpperCase();
		System.out.println(s5);
		System.out.println(s6);

		//17.去除字符串前后空白
		String s7 = new String("  ABC   ").trim();
		System.out.println(s7);

		//注意:trim()方法一般用来判断某一行是否为空行
		String line = "     ";
		if (line.length() == 0 || line.trim().length() == 0) {
			System.out.println("说明是空行.");
		}

		//18.把指定的类型转换成字符窜
		String s8 = String.valueOf(100);
		String s9 = String.valueOf(3.14);
	}
}
