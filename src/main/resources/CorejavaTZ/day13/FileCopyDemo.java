package com.corejava.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.corejava.util.IOUtil;

/**
 * 本类用来演示Java文件的拷贝
 * 
 * 作者:JSD1412 时间:2015-1-26 下午1:58:01
 */
public class FileCopyDemo {

	/**
	 * 拷贝文件
	 */
	public void copyFile(String src, String target) {
		// 1.根据源头或者目标创建相应的IO流

		// 不带有缓存能力的IO流,性能比较差
		// InputStream in = null;
		// OutputStream os = null;

		// 创建带有缓存能力的IO流,性能极高
		BufferedInputStream in = null;
		BufferedOutputStream os = null;

		// 初始化
		try {
			in = new BufferedInputStream(new FileInputStream(src));
			os = new BufferedOutputStream(new FileOutputStream(target));

			// 2.定义变量读取保存到的信息
			int len = -1;

			// 设置缓存大小,3K
			byte[] buf = new byte[3 * 1024];

			// 定义变量保存读取次数
			int count = 0;

			// 3.循环读取
			// 每次读取一个缓存大小
			while ((len = in.read(buf)) != -1) {

				count++;
				// 循环写入
				os.write(buf, 0, len);
			}
			System.out.println("拷贝成功,一共读取了:" + count + "次.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.资源释放
			IOUtil.byteRelease(in, os);
		}
	}

	public static void main(String[] args) {
		FileCopyDemo demo = new FileCopyDemo();
		demo.copyFile("F:\\day13笔记.txt", "F:\\day13笔记-副本.txt");
	}
}
