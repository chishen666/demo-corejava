package com.corejava.day09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 本类用来演示Java正则表达式模糊匹配内容
 *
 * 作者:JSD1412
 * 时间:2015-1-15 上午9:30:05
 */
public class RegexDemo2 {

	private String content;

	//构造方法初始化属性
	public RegexDemo2() {
		content = "Java is a very good programing lauguage,It was develop by SUN in 1996,"
				+ "Java was not similar with JavaScript."
				+ "If you want to learning Java,Please contact me at:"
				+ "allan0716@gmail.com or 1381234567.";
	}

	//模糊匹配文章内容
	public void matches(String regex) {
		//1.根据正则表达式创建匹配模板
		Pattern p = Pattern.compile(regex);
		//2.根据模板创建匹配器
		Matcher m = p.matcher(content);
		
		//统计出现次数
		int count = 0;
		
		//定义状态变量
		boolean bool = true;
		
		//3.模糊查找
		while (m.find()) {
			//说明找到相关内容,则打印
			System.out.println(m.group() + "在文中第[" + m.start() + "~" + m.end()
					+ "]位置处.");
			count++;//计数器加1
			bool = false;//改变状态变量的状态
		}
		System.out.println("文中匹配的内容一共出现了:" + count + "次.");
		if(bool){
			System.out.println("文中没有找到相关内容...");
		}
	}

	public static void main(String[] args) {
		RegexDemo2 rd = new RegexDemo2();
		rd.matches("Java");
	}
}
