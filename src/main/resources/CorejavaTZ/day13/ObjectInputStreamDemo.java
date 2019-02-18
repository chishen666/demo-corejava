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
 * 本类用来演示Java IO流操作对象类型
 *
 * 作者:JSD1412
 * 时间:2015-1-26 下午3:59:04
 */
public class ObjectInputStreamDemo {

	private String filepath = "F:\\仙剑奇侠传\\save";

	/**
	 * 把所有角色信息保存到本地存档文件中
	 */
	public void save(List<Role> roles) {
		//创建操作对象类型的字节输出流
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File(
					filepath, "\\" + System.currentTimeMillis() + ".sav")));
			//把对象写入文件中
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
	 * 从存档文件中读取当前所有角色信息
	 */
	public List<Role> load(String filepath) {
		//操作对象类型的字节输入流
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filepath));

			//读取对象
			Object obj = ois.readObject();
			return (List<Role>) obj;

		} catch (FileNotFoundException e) {
			System.err.println("存档文件丢失或者已经损坏...");
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
		Role r1 = new Role(1, "李逍遥", 39, 30000);
		Role r2 = new Role(2, "赵灵儿", 45, 30000);
		Role r3 = new Role(3, "林月如", 43, 30000);
		Role r4 = new Role(4, "阿奴", 30, 30000);
		roles.add(r1);
		roles.add(r2);
		roles.add(r3);
		roles.add(r4);
		demo.save(roles);*/

		List<Role> rols = demo.load("F:\\仙剑奇侠传\\save\\1422261820765.sav");

		for (Role r : rols) {
			System.out.println(r);
		}
	}
}
