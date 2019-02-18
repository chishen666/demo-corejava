package com.corejava.day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;

import com.corejava.util.IOUtil;

/**
 * ����������ʾJava�ֽ����������������ļ�
 *
 * ����:JSD1412
 * ʱ��:2015-1-26 ����1:35:28
 */
public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStreamDemo demo = new FileInputStreamDemo();
		demo.readInfoFromFile("F:\\day13�ʼ�.txt");
	}

	/**
	 * ��ȡ�����ļ���Ϣ,���Ҵ�ӡ�ڿ���̨��
	 */
	public void readInfoFromFile(String filepath) {
		
		//��ȡ�ļ����ֽ���
		long totalSize = new File(filepath).length();
		
		//���ָ�ʽ������
		NumberFormat nf = NumberFormat.getInstance();
		
		//����С������������������Сλ��
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		
		InputStream in = null;
		try {
			//����Դͷ����Ŀ�괴���������ҳ�ʼ��
			in = new FileInputStream(filepath);
			
			//�������,�����ȡ��������
			int len = -1;
			
			//ѭ����ȡ
			while(true){
				
				//��ǰIO����ʣ���ֽ���
				long size = in.available();
				
				//������ɱ���
				double result = (totalSize - size) * 1.0 / totalSize * 100;
				
				//����һλ��Ч����
				System.out.print(nf.format(result) + "%" + "\r");
				
				Thread.sleep(1);
				
				len = in.read();
				
				//�ж��˳�����
				if(len == -1){
					break;
				}
				//����̨���
				//System.out.print((char)len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			//IO��ʹ�����һ��Ҫ�ͷ���Դ,������ܳ������벻�������
			
			//�����ָ���쳣
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			//���ù������ͷ���Դ
			//IOUtil.release(in, null);
		}
	}
}
