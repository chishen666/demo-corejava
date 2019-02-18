package com.carrx.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

	private static final Properties prop = new Properties();

	private static final String PATH = "study/applicationContext.properties";

	static {
		// 第一种，通过类加载器进行获取properties文件流
		InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream(PATH);
		// 第二种，通过类进行获取properties文件流
		// InputStream in = PropertiesUtils.class.getResourceAsStream("/" + PATH);
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String getValue(String key) {
		return key == null ? "" : prop.getProperty(key);
	}
}
