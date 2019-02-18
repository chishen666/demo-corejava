package com.corejava.day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.corejava.util.IOUtil;

/**
 * 本类用来演示Java利用字符流除去目标文件空行并且写入到新文件中
 *
 * 作者:JSD1412
 * 时间:2015-1-27 上午9:27:38
 */
public class ReaderDemo2 {
	public static void main(String[] args) {
		clearSpaceLine("F:\\IO\\day13笔记.txt","F:\\IO\\day13笔记-NOSpaceLine.txt");
	}

	public static void clearSpaceLine(String src,String target) {
		//1.根据源头和目标创建IO流--字符输入流
		//Reader br = null;

		//改换带有缓存的版本
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			//br = new FileReader(filepath);

			br = new BufferedReader(new FileReader(src));
			
			//不带自动刷新能力的PrintWriter
			//pw = new PrintWriter(target);
			
			//自动刷新的PrintWriter
			pw = new PrintWriter(new FileWriter(target),true);

			//定义变量保存读取到的内容
			//int len = -1;
			String line = null;

			//2.循环读取
			while ((line = br.readLine()) != null) {//读取一行内容
				
				pw.println(line);
				
				//pw.write(line,0,line.length());
				//pw.flush();//手动刷新缓存,把缓冲区的内容刷入到文件中保存
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
