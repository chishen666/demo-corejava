package com.corejava.day14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 本类用来演示利用RandomAccessFile读取超大型文本文件的最后一行信息.
 * 比如:200MB+
 *
 * 作者:JSD1412
 * 时间:2015-1-27 下午2:29:05
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) {
		RandomAccessFileDemo demo = new RandomAccessFileDemo();
		String result = demo.readLastLine("F:\\IO\\day13笔记.txt");
		System.out.println(result);
	}

	/**
	 * 读取文件最后一行信息
	 */
	public String readLastLine(String filepath) {
		//构建随机访问存取流对象
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(filepath, "r");

			//思路:从后往前读取,遇到换行符,说明最后一行结束,利用seek()方法定位
			//最后一行的起始位置,然后通过readLine()直接读取最后一行.

			//获取文件长度
			long fileSize = raf.length();

			int len = -1;//定义变量保存读取到的内容

			//定义状态变量保存状态
			boolean bool = false;

			//循环向前移动指针
			while (!bool) {
				//定位文件指针到文件末尾处
				fileSize -= 1;
				raf.seek(fileSize);
				//读取指针出的内容
				len = raf.read();
				//判断当前指针处的内容是否为换行
				switch (len) {
				case -1:
				case '\n':
				case '\r':
					//说明最后一行的换行符已经找到,则重新定位到最后一行起始位置
					raf.seek(fileSize + 1);
					bool = true;
					break;
				}
			}
			//转换编码格式
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
