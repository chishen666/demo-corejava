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
 * ����������ʾ������
 *
 * ����:JSD1412
 * ʱ��:2015-1-21 ����3:41:42
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//1.��ȡϵͳ����
		Properties prop = System.getProperties();
		//System.out.println(prop);

		//���б���ʽչ��ϵͳ��Ϣ
		//prop.list(System.out);

		//����KEY��ȡVALUE(����ָ��key��ȡϵͳ����value)

		String osName = prop.getProperty("os.name");
		System.out.println(osName);

		String osArch = prop.getProperty("os.arch");
		System.out.println(osArch);

		String userName = prop.getProperty("user.name");
		System.out.println(userName);

		System.out.println("---------------------------------");

		//�����Զ��������б�
		Properties myProp = new Properties();

		//�Զ����ļ�,�Ѹ��ļ�ת����Java����--IO��
		InputStream in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("com\\corejava\\day12\\config.properties");

		try {
			//Ȼ����ص����������Զ�����
			myProp.load(in);

			//ͨ�������ļ���KEY��ȡ�����ļ���VALUE
			String username = myProp.getProperty("username");
			System.out.println(username);

			String password = myProp.getProperty("password");
			System.out.println(password);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
