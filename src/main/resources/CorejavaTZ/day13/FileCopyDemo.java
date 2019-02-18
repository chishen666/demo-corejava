package com.corejava.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.corejava.util.IOUtil;

/**
 * ����������ʾJava�ļ��Ŀ���
 * 
 * ����:JSD1412 ʱ��:2015-1-26 ����1:58:01
 */
public class FileCopyDemo {

	/**
	 * �����ļ�
	 */
	public void copyFile(String src, String target) {
		// 1.����Դͷ����Ŀ�괴����Ӧ��IO��

		// �����л���������IO��,���ܱȽϲ�
		// InputStream in = null;
		// OutputStream os = null;

		// �������л���������IO��,���ܼ���
		BufferedInputStream in = null;
		BufferedOutputStream os = null;

		// ��ʼ��
		try {
			in = new BufferedInputStream(new FileInputStream(src));
			os = new BufferedOutputStream(new FileOutputStream(target));

			// 2.���������ȡ���浽����Ϣ
			int len = -1;

			// ���û����С,3K
			byte[] buf = new byte[3 * 1024];

			// ������������ȡ����
			int count = 0;

			// 3.ѭ����ȡ
			// ÿ�ζ�ȡһ�������С
			while ((len = in.read(buf)) != -1) {

				count++;
				// ѭ��д��
				os.write(buf, 0, len);
			}
			System.out.println("�����ɹ�,һ����ȡ��:" + count + "��.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.��Դ�ͷ�
			IOUtil.byteRelease(in, os);
		}
	}

	public static void main(String[] args) {
		FileCopyDemo demo = new FileCopyDemo();
		demo.copyFile("F:\\day13�ʼ�.txt", "F:\\day13�ʼ�-����.txt");
	}
}
