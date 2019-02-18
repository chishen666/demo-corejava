package com.corejava.day13;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import com.corejava.day14.LogExceptionUtil;
import com.corejava.util.InputUtil;

/**
 * 本类用来演示java.io.File文件类
 *
 * 作者:JSD1412
 * 时间:2015-1-26 上午8:59:46
 */
public class FileDemo {

	/**
	 * 创建文件
	 */
	public void newFileCreate(String filepath) {
		//根据路径构建File实例
		File file = new File(filepath);
		try {
			//判断指定路径是否存在要创建的文件
			if (!file.exists()) {
				//创建一个文件
				boolean b = file.createNewFile();
				if (b) {
					System.out.println(file.getAbsolutePath() + ",创建成功!");
				}
			} else {
				System.out.println(file.getName() + ",已经存在...");
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println("系统找不到[" + file.getParent() + "]的路径!");
		}
	}

	/**
	 * 创建文件夹
	 */
	public void newFolderCreate(String filepath) {
		File file = new File(filepath);
		if (!file.exists()) {
			boolean b = file.mkdirs();//可以创建多层目录结构
			if (b) {
				System.out.println(file.getAbsolutePath() + ",创建成功!");
			}
		} else {
			System.err.println(file.getAbsolutePath() + ",已经存在...");
		}
	}

	/**
	 * 删除文件或者文件夹
	 */
	public void deleteFileOrFolder(String filepath) {
		File file = new File(filepath);
		if (file.exists()) {
			boolean b = file.delete();//删除文件或者目录(只能删除空文件夹)
			if (b) {
				System.out.println(file.getAbsolutePath() + ",删除成功!");
			} else {
				String cmd = InputUtil.inputLine("删除的目标不是空文件夹,确定要删除吗(Y/N)?");
				if (cmd.equalsIgnoreCase("Y")) {

					//TODO
					//1.获取该文件夹下所有的文件和文件夹信息
					//2.如果是文件直接删除,如果是文件夹,还要继续查看里面的内容
					//?

				} else {
					System.out.println("目标文件夹没有修改...");
				}
			}
		} else {
			System.err.println(file.getAbsolutePath() + ",不存在...");
		}
	}

	/**
	 * 查看文件夹信息
	 */
	public void fileList(String filepath) {
		File file = new File(filepath);
		if (file.exists()) {
			//判断目标是否是文件
			if (file.isDirectory()) {
				System.out.println(file.getAbsolutePath());
				fileList(file);
			} else {
				System.err.println("目标[" + file.getAbsolutePath() + "]是文件...");
			}
		} else {
			System.err.println(file.getAbsolutePath() + ",不存在...");
		}
	}

	public void fileList(File file) {
		//展示当前文件夹下所有的文件内容
		//File[] files = file.listFiles();

		//展示当前文件夹下符合要求的文件内容,传入文件名过滤器
		File[] files = file.listFiles(new SuffixFilter("html"));

		for (File f : files) {
			if (f.isDirectory()) {
				System.out.println(f.getAbsolutePath());
				fileList(f);
			} else {
				System.out.println("\t" + f.getName());
			}
		}
	}

	public static void main(String[] args) {
		//构建一个本地文件的File实例
		//File file = new File("F:\\picture.jpg");

		//获取文件父目录的路径
		//String parentPath = file.getParent();
		//System.out.println(parentPath);

		FileDemo fd = new FileDemo();
		//fd.newFileCreate("H:\\IO\\霍比特人3.rmvb");
		//fd.newFolderCreate("F:\\IO\\day13");
		//fd.deleteFileOrFolder("F:\\111\\222");

		fd.fileList("C:\\JDK\\jdk1.7.0_25");
	}
}
