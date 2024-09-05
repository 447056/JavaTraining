package com.oops.basic;

public class Employee {

	String name;
	double salary;
	
	void getDetails() {
		System.out.println("Name "+name);
		System.out.println("Salary"+salary);
	}
	String greet(String message) {
		return message+ " "+name;
	}
	}

