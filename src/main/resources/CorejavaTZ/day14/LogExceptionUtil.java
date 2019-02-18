package com.corejava.day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.corejava.util.DateUtil;

/**�쳣��¼������*/
public class LogExceptionUtil {

	//���쳣��ջ��Ϣ��¼�������ļ���
	//1.�����쳣��ջ��Ϣ���ַ���
	//2.д�뵽Ŀ���ļ���,����ʵ��׷��д��
	//3.���ɵ��ļ���ָ��Ŀ¼��
	//4.��־��������ʱ��������
	//5.��¼������˳��Ϊ���µļ�¼���ļ����Ϸ�
	public static void log(Exception exception) {

		//���÷��������쳣�ַ�����Ϣ
		String message = createExceptionMessage(exception);

		String filepath = "src\\com\\corejava\\util\\log_"
				+ DateUtil.formateDate(new Date(), "yyyy.MM.dd") + ".txt";

		//�����ַ������
		PrintWriter pw = null;
		
		try { 
			//��һ��true��ʾ�Ƿ�׷��д��
			//�ڶ���true��ʾ�Զ�ˢ��PrintWriter
			//pw = new PrintWriter(new FileWriter(filepath, true), true);
			pw = new PrintWriter(new FileWriter(filepath,true), true);

			//���쳣��Ϣд�뵽Ŀ���¼�ļ���
			pw.println(message);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();//PrintWriter��close()����û��IO�쳣
			}
		}
	}

	/**
	 * ���쳣ת���ɶ�ջ��Ϣ�ַ����ķ���
	 */
	private static String createExceptionMessage(Exception e) {
		//��ȡ������Ϣ̧ͷ
		String exceptionMessage = DateUtil.formateDate(new Date(),
				"yyyy-MM-dd HH:mm:ss")
				+ "\n"
				+ e.getClass().getName()
				+ ": "
				+ e.getMessage();

		//��ȡ������Ϣ
		StackTraceElement[] elements = e.getStackTrace();
		for (StackTraceElement element : elements) {
			exceptionMessage += "\n\tat " + element;
		}
		exceptionMessage += "\n\n-------------------------------------------------------------";
		return exceptionMessage;
	}
}
