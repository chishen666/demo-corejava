package com.corejava.day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.corejava.util.IOUtil;

/**
 * 本类用来演示Java利用字符流读取本地文本文件信息
 * 并且打印在控制台上
 *
 * 作者:JSD1412
 * 时间:2015-1-27 上午9:27:38
 */
public class ReaderDemo1 {
	public static void main(String[] args) {
		print("F:\\IO\\day13笔记.txt");
	}

	public static void print(String filepath) {
		//1.根据源头和目标创建IO流--字符输入流
		//Reader br = null;

		//改换带有缓存的版本
		BufferedReader br = null;

		try {
			//br = new FileReader(filepath);

			br = new BufferedReader(new FileReader(filepath));

			//定义变量保存读取到的内容
			//int len = -1;
			String line = null;

			//2.循环读取
			while ((line = br.readLine()) != null) {//读取一行内容
				
				//业务方法
				//...
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4.关闭流,释放资源
			IOUtil.charRelease(br, null);
		}
	}
}
