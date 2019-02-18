package com.corejava.day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.corejava.util.DateUtil;

/**异常记录工具类*/
public class LogExceptionUtil {

	//把异常堆栈信息记录到本地文件中
	//1.构建异常堆栈信息的字符串
	//2.写入到目标文件中,并且实现追加写入
	//3.生成的文件在指定目录下
	//4.日志按照日期时间来划分
	//5.记录的内容顺序为最新的记录在文件最上方
	public static void log(Exception exception) {

		//调用方法构建异常字符串信息
		String message = createExceptionMessage(exception);

		String filepath = "src\\com\\corejava\\util\\log_"
				+ DateUtil.formateDate(new Date(), "yyyy.MM.dd") + ".txt";

		//创建字符输出流
		PrintWriter pw = null;
		
		try { 
			//第一个true表示是否追加写入
			//第二个true表示自动刷新PrintWriter
			//pw = new PrintWriter(new FileWriter(filepath, true), true);
			pw = new PrintWriter(new FileWriter(filepath,true), true);

			//把异常信息写入到目标记录文件中
			pw.println(message);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();//PrintWriter的close()方法没有IO异常
			}
		}
	}

	/**
	 * 把异常转换成堆栈信息字符串的方法
	 */
	private static String createExceptionMessage(Exception e) {
		//获取错误信息抬头
		String exceptionMessage = DateUtil.formateDate(new Date(),
				"yyyy-MM-dd HH:mm:ss")
				+ "\n"
				+ e.getClass().getName()
				+ ": "
				+ e.getMessage();

		//获取跟踪信息
		StackTraceElement[] elements = e.getStackTrace();
		for (StackTraceElement element : elements) {
			exceptionMessage += "\n\tat " + element;
		}
		exceptionMessage += "\n\n-------------------------------------------------------------";
		return exceptionMessage;
	}
}
