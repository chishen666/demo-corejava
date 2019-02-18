package com.corejava.day12;

/**四季枚举*/
public enum Season {
	SPRING("春天") {
		@Override
		public Season next() {
			return SUMMER;
		}
	},
	SUMMER("夏天") {
		@Override
		public Season next() {
			return AUTUMN;
		}
	},
	AUTUMN("秋天") {
		@Override
		public Season next() {
			return WINTER;
		}
	},
	WINTER("冬天") {
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
