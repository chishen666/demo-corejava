package com.corejava.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 本类用来演示Java IO流操作基本类型
 *
 * 作者:JSD1412
 * 时间:2015-1-26 下午2:40:29
 */
public class DataInputStreamDemo {

	//保存id数值
	private static String filepath = "src\\com\\corejava\\day13\\log.txt";
	
	public static void main(String[] args) {
		printLong();
	}

	/**
	 * 生成10个用户重复的自增长整型
	 */
	public static void printLong() {
		for (int i = 0; i < 10; i++) {
			try {
				long l = 0;
				//判断文件是否为空
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
	 * 把文件中的long读取出来
	 */
	public static long read() throws IOException {
		//创建操作基本类型的字节输入流
		DataInputStream dis = new DataInputStream(new FileInputStream(filepath));
		long l = dis.readLong();
		dis.close();
		return l;
	}

	/**
	 * 把long值写入到本地文件中
	 */
	public static void write(long l) throws IOException {
		//创建操作基本类型的字节输出流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				filepath));
		dos.writeLong(l);
		dos.close();
	}
}
