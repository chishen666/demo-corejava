package com.corejava.day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * ����������ʾJava�쳣����Ĳ�ͬд��
 *
 * ����:JSD1412
 * ʱ��:2015-1-15 ����2:12:13
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {

		//1.(�Ƽ�)����ͬ���쳣,�ȿ��Կ��������쳣������,Ҳ���Է��������
		try {
			Thread.sleep(1);
			new SimpleDateFormat("yyyy-MM-dd").parse("2014");
			InputStream in = new FileInputStream("D:\\src.txt");
			Connection conn = DriverManager.getConnection("");
		} catch (InterruptedException e) {
			//...
		} catch (ParseException e) {
			//...
		} catch (FileNotFoundException e) {
			//...
		} catch (SQLException e) {
			//...
		} finally {
			//������������Ƿ�����쳣,finally�����ʼ�ջᱻִ��
			//һ�������ر�����,�ͷ���Դ
			System.out.println("--finally---");
		}

		//2.(JDK1.7���ṩ)����ͬ���쳣,���Կ����������ʲô�쳣,�����ܹ�ͳһ����
		try {
			Thread.sleep(1);
			new SimpleDateFormat("yyyy-MM-dd").parse("2014");
			InputStream in = new FileInputStream("D:\\src.txt");
			Connection conn = DriverManager.getConnection("");
		} catch (InterruptedException | ParseException | FileNotFoundException
				| SQLException e) {
			//...
		} finally {
			//...
		}
	}
}
