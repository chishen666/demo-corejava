package com.corejava.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ����������ʾ�Ž�����ʹ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����2:11:13
 */
public class InputStreamReaderDemo1 {
	public static void main(String[] args) {
		print("F:\\IO\\day13�ʼ�.txt");
	}

	public static void print(String filepath) {
		InputStream in = null;
		InputStreamReader is = null;
		try {
			in = new FileInputStream(filepath);

			//���ֽ���ת�����ַ���
			is = new InputStreamReader(in,"GBK");

			int len = -1;
			while ((len = is.read()) != -1) {
				System.out.print((char) len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�رյ�ԭ����:�ȴ򿪵ĺ�ر�
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
