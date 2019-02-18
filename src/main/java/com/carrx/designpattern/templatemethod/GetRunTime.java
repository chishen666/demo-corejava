package com.carrx.designpattern.templatemethod;

public abstract class GetRunTime {

	public final void runTime() {
		long start = System.currentTimeMillis();
		execute();
		long end = System.currentTimeMillis();
		System.out.println("运行时间: " + (end - start) + "ms");
	}

	abstract void execute();
}
