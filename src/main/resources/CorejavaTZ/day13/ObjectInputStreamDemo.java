package com.corejava.day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.corejava.util.IOUtil;

/**
 * ����������ʾJava IO��������������
 *
 * ����:JSD1412
 * ʱ��:2015-1-26 ����3:59:04
 */
public class ObjectInputStreamDemo {

	private String filepath = "F:\\�ɽ�������\\save";

	/**
	 * �����н�ɫ��Ϣ���浽���ش浵�ļ���
	 */
	public void save(List<Role> roles) {
		//���������������͵��ֽ������
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File(
					filepath, "\\" + System.currentTimeMillis() + ".sav")));
			//�Ѷ���д���ļ���
			oos.writeObject(roles);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtil.byteRelease(null, oos);
		}
	}

	/**
	 * �Ӵ浵�ļ��ж�ȡ��ǰ���н�ɫ��Ϣ
	 */
	public List<Role> load(String filepath) {
		//�����������͵��ֽ�������
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filepath));

			//��ȡ����
			Object obj = ois.readObject();
			return (List<Role>) obj;

		} catch (FileNotFoundException e) {
			System.err.println("�浵�ļ���ʧ�����Ѿ���...");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			IOUtil.byteRelease(ois, null);
		}
		return null;
	}

	public static void main(String[] args) {
		ObjectInputStreamDemo demo = new ObjectInputStreamDemo();

/*		List<Role> roles = new ArrayList<>();
		Role r1 = new Role(1, "����ң", 39, 30000);
		Role r2 = new Role(2, "�����", 45, 30000);
		Role r3 = new Role(3, "������", 43, 30000);
		Role r4 = new Role(4, "��ū", 30, 30000);
		roles.add(r1);
		roles.add(r2);
		roles.add(r3);
		roles.add(r4);
		demo.save(roles);*/

		List<Role> rols = demo.load("F:\\�ɽ�������\\save\\1422261820765.sav");

		for (Role r : rols) {
			System.out.println(r);
		}
	}
}
