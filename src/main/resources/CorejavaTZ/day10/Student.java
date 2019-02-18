package com.corejava.day10;

//被克隆的对象必须实现克隆标记接口:java.lang.Cloneable,
//否则会抛出克隆不支持异常:java.lang.CloneNotSupportedException
public class Student implements Cloneable {
	private int id;
	private String name;
	private Clazz clazz;

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, Clazz clazz) {
		this.id = id;
		this.name = name;
		this.clazz = clazz;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	//重写hashCode()方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//重写equals()方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (clazz == null) {
			if (other.clazz != null)
				return false;
		} else if (!clazz.equals(other.clazz))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*	//重写equals()方法
	@Override
	public boolean equals(Object obj) {
		//1.非空判断
		if (obj == null) {
			return false;
		}
		//2.自反性判断
		if (this == obj) {
			return true;
		}
		//3.判断类型是否一致
		//if(obj.getClass() == Student.class);
		if (obj instanceof Student) {
			//说明类型一致,则强制类型转换
			Student s = (Student) obj;
			//一一获取属性并且比较
			return s.getId() == id && s.getName().equals(name)
					&& s.getClazz().equals(clazz);
		}
		return false;
	}

	//重写hashCode()方法
	@Override
	public int hashCode() {
		return ...;
	}
	*/

	//重写clone()方法,把修饰符从protected改成public
	//Object中的clone()方法默认就是浅层复制,为了降低程序的资源消耗,提高性能
	//如果要实现深层复制,则需要通过程序员自己写代码实现!

	//浅层复制
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//深层复制
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		if (clazz != null) {
			student.setClazz(new Clazz(clazz.getCap(), clazz.getName()));
		}
		return student;
	}*/

	//toString()方法也能自动生成,但是一般无法符合要求
	//重写toString()方法
	/*@Override
	public String toString() {
		String msg = "学号:" + id + ",姓名:" + name;
		//判断是否有班级
		if (clazz != null) {
			msg += "," + clazz;
		} else {
			msg += ",该学生暂无班级信息...";
		}
		return msg;
	}*/

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("学号:" + id + ",姓名:" + name);
		//判断是否有班级
		if (clazz != null) {
			builder.append(",").append(clazz);
		} else {
			builder.append(",该学生暂无班级信息...");
		}
		return builder.toString();
	}
}
