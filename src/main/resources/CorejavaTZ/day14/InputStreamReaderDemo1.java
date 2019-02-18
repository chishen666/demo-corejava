package com.corejava.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 本类用来演示桥接器的使用
 *
 * 作者:JSD1412
 * 时间:2015-1-27 下午2:11:13
 */
public class InputStreamReaderDemo1 {
	public static void main(String[] args) {
		print("F:\\IO\\day13笔记.txt");
	}

	public static void print(String filepath) {
		InputStream in = null;
		InputStreamReader is = null;
		try {
			in = new FileInputStream(filepath);

			//把字节流转换成字符流
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
			//关闭的原则是:先打开的后关闭
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
