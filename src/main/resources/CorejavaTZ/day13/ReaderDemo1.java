package com.corejava.day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.corejava.util.IOUtil;

/**
 * ����������ʾJava�����ַ�����ȡ�����ı��ļ���Ϣ
 * ���Ҵ�ӡ�ڿ���̨��
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����9:27:38
 */
public class ReaderDemo1 {
	public static void main(String[] args) {
		print("F:\\IO\\day13�ʼ�.txt");
	}

	public static void print(String filepath) {
		//1.����Դͷ��Ŀ�괴��IO��--�ַ�������
		//Reader br = null;

		//�Ļ����л���İ汾
		BufferedReader br = null;

		try {
			//br = new FileReader(filepath);

			br = new BufferedReader(new FileReader(filepath));

			//������������ȡ��������
			//int len = -1;
			String line = null;

			//2.ѭ����ȡ
			while ((line = br.readLine()) != null) {//��ȡһ������
				
				//ҵ�񷽷�
				//...
				System.out.println(line);
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
