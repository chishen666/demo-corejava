package com.corejava.day05;

/**班级实体类*/
public class Clazz {
	//属性
	private String clazzName;//名称
	private int clazzCap;//容量

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
		return "班级信息:班级名称:" + clazzName + ",班级人数:" + clazzCap;
	}
}
