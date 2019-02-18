package com.corejava.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.corejava.util.IOUtil;

/**
 * 本类用来演示利用桥接器实现获取用户键盘输入
 *
 * 作者:JSD1412
 * 时间:2015-1-27 下午2:22:02
 */
public class InputStreamReaderDemo2 {
	public static void main(String[] args) {

		//把系统标准输入流转换成字符流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//系统标准输入
		System.out.println("请您输入内容:");
		try {
			//从字符流中读取信息
			String line = br.readLine();//阻塞方法
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtil.charRelease(br, null);
		}
	}
}
