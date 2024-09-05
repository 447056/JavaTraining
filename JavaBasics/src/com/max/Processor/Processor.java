package com.max.Processor;

public class Processor {

	void calculate(double x) {
		System.out.println(Math.sqrt(x));
	}
	
	void calculate(int x, int y) {
		System.out.println(x*y);
	}
	
	void calculate(double x, double y) {
		System.out.println(x-y);
	}
	void calculate(double x, int y) {
		System.out.println(Math.pow(x, y));
	}
	void calculate(int x) {
		System.out.println(x*x);
	}
}
