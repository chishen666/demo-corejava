package com.carrx.corejava.nestedclass;

public class OuterClass {

	private int id = 1;

	private static int ID = 100;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void out() {
	}

	public void memberTest() {
		MemberClass member = new MemberClass();
		member.in();
	}

	public void staticTest() {
		StaticClass s = new StaticClass();
		s.in();
	}

	public class MemberClass {
		private int id = 2;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void in() {
			System.out.println(id);
		}

		public void test() {
			System.out.println(OuterClass.this.id);
		}

	}

	public static class StaticClass {
		private int id = 3;

		public void in() {
			System.out.println(id);
		}

		public void test() {
			System.out.println(OuterClass.ID);
		}
	}
}
