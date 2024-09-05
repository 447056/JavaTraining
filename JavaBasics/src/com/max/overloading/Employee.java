package com.max.overloading;

public class Employee {

	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;

	}

	double calcBonus(double basicAllowance) {
		System.out.println(basicAllowance);
		return basicAllowance;

	}

	double calcBonus(double basicAllowance, double carallowance) {
		double allowance = basicAllowance + carallowance;
		System.out.println(allowance);
		return allowance;

	}

	double calcBonus(double basicAllowance, double carallowance, double houseAllowance) {
		double allowance = basicAllowance + carallowance + houseAllowance;
		System.out.println(allowance);
		return allowance;

	}

}
