package com.corejava.day10;

//����¡�Ķ������ʵ�ֿ�¡��ǽӿ�:java.lang.Cloneable,
//������׳���¡��֧���쳣:java.lang.CloneNotSupportedException
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

	//��дhashCode()����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//��дequals()����
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

	/*	//��дequals()����
	@Override
	public boolean equals(Object obj) {
		//1.�ǿ��ж�
		if (obj == null) {
			return false;
		}
		//2.�Է����ж�
		if (this == obj) {
			return true;
		}
		//3.�ж������Ƿ�һ��
		//if(obj.getClass() == Student.class);
		if (obj instanceof Student) {
			//˵������һ��,��ǿ������ת��
			Student s = (Student) obj;
			//һһ��ȡ���Բ��ұȽ�
			return s.getId() == id && s.getName().equals(name)
					&& s.getClazz().equals(clazz);
		}
		return false;
	}

	//��дhashCode()����
	@Override
	public int hashCode() {
		return ...;
	}
	*/

	//��дclone()����,�����η���protected�ĳ�public
	//Object�е�clone()����Ĭ�Ͼ���ǳ�㸴��,Ϊ�˽��ͳ������Դ����,�������
	//���Ҫʵ����㸴��,����Ҫͨ������Ա�Լ�д����ʵ��!

	//ǳ�㸴��
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//��㸴��
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

	//toString()����Ҳ���Զ�����,����һ���޷�����Ҫ��
	//��дtoString()����
	/*@Override
	public String toString() {
		String msg = "ѧ��:" + id + ",����:" + name;
		//�ж��Ƿ��а༶
		if (clazz != null) {
			msg += "," + clazz;
		} else {
			msg += ",��ѧ�����ް༶��Ϣ...";
		}
		return msg;
	}*/

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("ѧ��:" + id + ",����:" + name);
		//�ж��Ƿ��а༶
		if (clazz != null) {
			builder.append(",").append(clazz);
		} else {
			builder.append(",��ѧ�����ް༶��Ϣ...");
		}
		return builder.toString();
	}
}
