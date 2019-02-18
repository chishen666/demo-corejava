package com.carrx.corejava.oo.b_encapsulation;

public class Person {

	static {
		System.out.println("静态代码块...");
	}
	{
		System.out.println("构造代码块1");
	}
	private int id;

	private String name;

	{
		System.out.println("构造代码块2");
	}

	public Person() {
		System.out.println("1");
	}

	public Person(int id) {
		this();
		System.out.println("2");
		this.id = id;
	}

	public Person(int id, String name) {
		this(id);
		System.out.println("3");
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	{
		System.out.println("构造代码块3");
	}

	public boolean compare(Person p) {
		return id > p.getId();
	}
}
