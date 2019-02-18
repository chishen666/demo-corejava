package com.carrx.designpattern.templatemethod;

public class GetRunTimeDemo {

	public static void main(String[] args) {
		new GetRunTime() {

			@Override
			void execute() {
				for (int i = 0; i < 10000; i++) {
					i++;
				}
			}
		}.runTime();

	}
}
