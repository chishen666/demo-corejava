package com.carrx.util;

import java.io.File;

/**
 * 文件处理工具类
 * 
 * @author SEELE
 *
 */
public class FileUtils {

	public static void main(String[] args) {
		// rename
		// String srcFile = "F:\\技术\\技术类别\\corejava\\毕向东corejava视频\\第11-12天多线程";
		// rename(srcFile, "黑马程序员_毕向东_Java基础视频教程".length());
	}

	private FileUtils() {
	}

	/**
	 * 指定文件夹下所有文件重命名
	 */
	public static void rename(String srcFile, int subINdex) {
		File file = new File(srcFile);
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				String name = f.getName();
				File desFile = new File(f.getParent() + File.separator + name.substring(subINdex, name.length()));
				f.renameTo(desFile);
			}
		}
	}
}
