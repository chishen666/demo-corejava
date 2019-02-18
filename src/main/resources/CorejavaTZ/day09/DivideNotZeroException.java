package com.corejava.day09;

/**自定义异常*/
public class DivideNotZeroException extends Exception {

	public DivideNotZeroException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DivideNotZeroException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DivideNotZeroException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DivideNotZeroException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DivideNotZeroException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
