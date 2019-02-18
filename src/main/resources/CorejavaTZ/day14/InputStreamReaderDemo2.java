package com.corejava.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.corejava.util.IOUtil;

/**
 * ����������ʾ�����Ž���ʵ�ֻ�ȡ�û���������
 *
 * ����:JSD1412
 * ʱ��:2015-1-27 ����2:22:02
 */
public class InputStreamReaderDemo2 {
	public static void main(String[] args) {

		//��ϵͳ��׼������ת�����ַ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//ϵͳ��׼����
		System.out.println("������������:");
		try {
			//���ַ����ж�ȡ��Ϣ
			String line = br.readLine();//��������
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtil.charRelease(br, null);
		}
	}
}
