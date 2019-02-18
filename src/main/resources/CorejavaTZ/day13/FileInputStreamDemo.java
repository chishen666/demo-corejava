package com.corejava.day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;

import com.corejava.util.IOUtil;

/**
 * 本类用来演示Java字节输入和输出流操作文件
 *
 * 作者:JSD1412
 * 时间:2015-1-26 下午1:35:28
 */
public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStreamDemo demo = new FileInputStreamDemo();
		demo.readInfoFromFile("F:\\day13笔记.txt");
	}

	/**
	 * 读取本地文件信息,并且打印在控制台上
	 */
	public void readInfoFromFile(String filepath) {
		
		//获取文件的字节数
		long totalSize = new File(filepath).length();
		
		//数字格式化对象
		NumberFormat nf = NumberFormat.getInstance();
		
		//设置小数部分所允许的最大最小位数
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		
		InputStream in = null;
		try {
			//根据源头或者目标创建流对象并且初始化
			in = new FileInputStream(filepath);
			
			//定义变量,保存读取到的内容
			int len = -1;
			
			//循环读取
			while(true){
				
				//当前IO流中剩余字节数
				long size = in.available();
				
				//计算完成比例
				double result = (totalSize - size) * 1.0 / totalSize * 100;
				
				//保留一位有效数字
				System.out.print(nf.format(result) + "%" + "\r");
				
				Thread.sleep(1);
				
				len = in.read();
				
				//判断退出条件
				if(len == -1){
					break;
				}
				//控制台输出
				//System.out.print((char)len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			//IO流使用完毕一定要释放资源,否则可能出现意想不到的情况
			
			//避免空指针异常
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			//利用工具类释放资源
			//IOUtil.release(in, null);
		}
	}
}
