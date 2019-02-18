package com.corejava.day12;

/**�ļ�ö��*/
public enum Season {
	SPRING("����") {
		@Override
		public Season next() {
			return SUMMER;
		}
	},
	SUMMER("����") {
		@Override
		public Season next() {
			return AUTUMN;
		}
	},
	AUTUMN("����") {
		@Override
		public Season next() {
			return WINTER;
		}
	},
	WINTER("����") {
		@Override
		public Season next() {
			return SPRING;
		}
	};

	private String msg;

	private Season(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	public abstract Season next();
}
