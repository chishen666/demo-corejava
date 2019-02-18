package com.corejava.day13;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import com.corejava.day14.LogExceptionUtil;
import com.corejava.util.InputUtil;

/**
 * ����������ʾjava.io.File�ļ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-26 ����8:59:46
 */
public class FileDemo {

	/**
	 * �����ļ�
	 */
	public void newFileCreate(String filepath) {
		//����·������Fileʵ��
		File file = new File(filepath);
		try {
			//�ж�ָ��·���Ƿ����Ҫ�������ļ�
			if (!file.exists()) {
				//����һ���ļ�
				boolean b = file.createNewFile();
				if (b) {
					System.out.println(file.getAbsolutePath() + ",�����ɹ�!");
				}
			} else {
				System.out.println(file.getName() + ",�Ѿ�����...");
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println("ϵͳ�Ҳ���[" + file.getParent() + "]��·��!");
		}
	}

	/**
	 * �����ļ���
	 */
	public void newFolderCreate(String filepath) {
		File file = new File(filepath);
		if (!file.exists()) {
			boolean b = file.mkdirs();//���Դ������Ŀ¼�ṹ
			if (b) {
				System.out.println(file.getAbsolutePath() + ",�����ɹ�!");
			}
		} else {
			System.err.println(file.getAbsolutePath() + ",�Ѿ�����...");
		}
	}

	/**
	 * ɾ���ļ������ļ���
	 */
	public void deleteFileOrFolder(String filepath) {
		File file = new File(filepath);
		if (file.exists()) {
			boolean b = file.delete();//ɾ���ļ�����Ŀ¼(ֻ��ɾ�����ļ���)
			if (b) {
				System.out.println(file.getAbsolutePath() + ",ɾ���ɹ�!");
			} else {
				String cmd = InputUtil.inputLine("ɾ����Ŀ�겻�ǿ��ļ���,ȷ��Ҫɾ����(Y/N)?");
				if (cmd.equalsIgnoreCase("Y")) {

					//TODO
					//1.��ȡ���ļ��������е��ļ����ļ�����Ϣ
					//2.������ļ�ֱ��ɾ��,������ļ���,��Ҫ�����鿴���������
					//?

				} else {
					System.out.println("Ŀ���ļ���û���޸�...");
				}
			}
		} else {
			System.err.println(file.getAbsolutePath() + ",������...");
		}
	}

	/**
	 * �鿴�ļ�����Ϣ
	 */
	public void fileList(String filepath) {
		File file = new File(filepath);
		if (file.exists()) {
			//�ж�Ŀ���Ƿ����ļ�
			if (file.isDirectory()) {
				System.out.println(file.getAbsolutePath());
				fileList(file);
			} else {
				System.err.println("Ŀ��[" + file.getAbsolutePath() + "]���ļ�...");
			}
		} else {
			System.err.println(file.getAbsolutePath() + ",������...");
		}
	}

	public void fileList(File file) {
		//չʾ��ǰ�ļ��������е��ļ�����
		//File[] files = file.listFiles();

		//չʾ��ǰ�ļ����·���Ҫ����ļ�����,�����ļ���������
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
		//����һ�������ļ���Fileʵ��
		//File file = new File("F:\\picture.jpg");

		//��ȡ�ļ���Ŀ¼��·��
		//String parentPath = file.getParent();
		//System.out.println(parentPath);

		FileDemo fd = new FileDemo();
		//fd.newFileCreate("H:\\IO\\��������3.rmvb");
		//fd.newFolderCreate("F:\\IO\\day13");
		//fd.deleteFileOrFolder("F:\\111\\222");

		fd.fileList("C:\\JDK\\jdk1.7.0_25");
	}
}
