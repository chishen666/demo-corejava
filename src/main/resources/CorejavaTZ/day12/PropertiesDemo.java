package com.corejava.day12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * 本类用来演示属性类
 *
 * 作者:JSD1412
 * 时间:2015-1-21 下午3:41:42
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//1.获取系统属性
		Properties prop = System.getProperties();
		//System.out.println(prop);

		//以列表形式展现系统信息
		//prop.list(System.out);

		//根据KEY获取VALUE(根据指定key获取系统属性value)

		String osName = prop.getProperty("os.name");
		System.out.println(osName);

		String osArch = prop.getProperty("os.arch");
		System.out.println(osArch);

		String userName = prop.getProperty("user.name");
		System.out.println(userName);

		System.out.println("---------------------------------");

		//创建自定义属性列表
		Properties myProp = new Properties();

		//自定义文件,把该文件转换成Java对象--IO流
		InputStream in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("com\\corejava\\day12\\config.properties");

		try {
			//然后加载到创建的属性对象中
			myProp.load(in);

			//通过属性文件的KEY获取属性文件的VALUE
			String username = myProp.getProperty("username");
			System.out.println(username);

			String password = myProp.getProperty("password");
			System.out.println(password);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
