package com.corejava.day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.corejava.util.IOUtil;

/**
 * ����������ʾJava�����ַ�����ȥĿ���ļ����в���д�뵽���ļ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����9:27:38
 */
public class ReaderDemo2 {
	public static void main(String[] args) {
		clearSpaceLine("F:\\IO\\day13�ʼ�.txt","F:\\IO\\day13�ʼ�-NOSpaceLine.txt");
	}

	public static void clearSpaceLine(String src,String target) {
		//1.����Դͷ��Ŀ�괴��IO��--�ַ�������
		//Reader br = null;

		//�Ļ����л���İ汾
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			//br = new FileReader(filepath);

			br = new BufferedReader(new FileReader(src));
			
			//�����Զ�ˢ��������PrintWriter
			//pw = new PrintWriter(target);
			
			//�Զ�ˢ�µ�PrintWriter
			pw = new PrintWriter(new FileWriter(target),true);

			//������������ȡ��������
			//int len = -1;
			String line = null;

			//2.ѭ����ȡ
			while ((line = br.readLine()) != null) {//��ȡһ������
				
				pw.println(line);
				
				//pw.write(line,0,line.length());
				//pw.flush();//�ֶ�ˢ�»���,�ѻ�����������ˢ�뵽�ļ��б���
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4.�ر���,�ͷ���Դ
			IOUtil.charRelease(br, null);
		}
	}
}
