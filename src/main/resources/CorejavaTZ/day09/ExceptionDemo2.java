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
 * 本类用来演示Java异常捕获的不同写法
 *
 * 作者:JSD1412
 * 时间:2015-1-15 下午2:12:13
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {

		//1.(推荐)捕获不同的异常,既可以看到捕获异常的名字,也可以分情况处理
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
			//无论上面代码是否出现异常,finally代码块始终会被执行
			//一般用来关闭连接,释放资源
			System.out.println("--finally---");
		}

		//2.(JDK1.7中提供)捕获不同的异常,可以看到捕获的是什么异常,并且能够统一处理
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
