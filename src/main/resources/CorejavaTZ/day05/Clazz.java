package com.corejava.day05;

/**�༶ʵ����*/
public class Clazz {
	//����
	private String clazzName;//����
	private int clazzCap;//����

	public Clazz() {

	}

	public Clazz(String clazzName, int clazzCap) {
		this.clazzName = clazzName;
		this.clazzCap = clazzCap;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public int getClazzCap() {
		return clazzCap;
	}

	public void setClazzCap(int clazzCap) {
		this.clazzCap = clazzCap;
	}

	public String printClazzInfo() {
		return "�༶��Ϣ:�༶����:" + clazzName + ",�༶����:" + clazzCap;
	}
}
