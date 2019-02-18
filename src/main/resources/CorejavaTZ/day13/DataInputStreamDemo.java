package com.corejava.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������ʾJava IO��������������
 *
 * ����:JSD1412
 * ʱ��:2015-1-26 ����2:40:29
 */
public class DataInputStreamDemo {

	//����id��ֵ
	private static String filepath = "src\\com\\corejava\\day13\\log.txt";
	
	public static void main(String[] args) {
		printLong();
	}

	/**
	 * ����10���û��ظ�������������
	 */
	public static void printLong() {
		for (int i = 0; i < 10; i++) {
			try {
				long l = 0;
				//�ж��ļ��Ƿ�Ϊ��
				if(new File(filepath).length() == 0){
					l = 100;
				}else{
					l = read();
				}
				System.out.println(l);
				write(l + 1);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ���ļ��е�long��ȡ����
	 */
	public static long read() throws IOException {
		//���������������͵��ֽ�������
		DataInputStream dis = new DataInputStream(new FileInputStream(filepath));
		long l = dis.readLong();
		dis.close();
		return l;
	}

	/**
	 * ��longֵд�뵽�����ļ���
	 */
	public static void write(long l) throws IOException {
		//���������������͵��ֽ������
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				filepath));
		dos.writeLong(l);
		dos.close();
	}
}
