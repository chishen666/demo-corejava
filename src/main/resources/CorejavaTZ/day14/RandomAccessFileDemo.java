package com.corejava.day14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ����������ʾ����RandomAccessFile��ȡ�������ı��ļ������һ����Ϣ.
 * ����:200MB+
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����2:29:05
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) {
		RandomAccessFileDemo demo = new RandomAccessFileDemo();
		String result = demo.readLastLine("F:\\IO\\day13�ʼ�.txt");
		System.out.println(result);
	}

	/**
	 * ��ȡ�ļ����һ����Ϣ
	 */
	public String readLastLine(String filepath) {
		//����������ʴ�ȡ������
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(filepath, "r");

			//˼·:�Ӻ���ǰ��ȡ,�������з�,˵�����һ�н���,����seek()������λ
			//���һ�е���ʼλ��,Ȼ��ͨ��readLine()ֱ�Ӷ�ȡ���һ��.

			//��ȡ�ļ�����
			long fileSize = raf.length();

			int len = -1;//������������ȡ��������

			//����״̬��������״̬
			boolean bool = false;

			//ѭ����ǰ�ƶ�ָ��
			while (!bool) {
				//��λ�ļ�ָ�뵽�ļ�ĩβ��
				fileSize -= 1;
				raf.seek(fileSize);
				//��ȡָ���������
				len = raf.read();
				//�жϵ�ǰָ�봦�������Ƿ�Ϊ����
				switch (len) {
				case -1:
				case '\n':
				case '\r':
					//˵�����һ�еĻ��з��Ѿ��ҵ�,�����¶�λ�����һ����ʼλ��
					raf.seek(fileSize + 1);
					bool = true;
					break;
				}
			}
			//ת�������ʽ
			String result = new String(raf.readLine().getBytes("ISO-8859-1"),
					"GBK");
			return result;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
