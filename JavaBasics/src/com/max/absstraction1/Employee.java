package com.max.absstraction1;

public abstract class Employee {

	String empName;
	double salary;
	int empId;
	final String companyName="MAXIMUS";
	
	
	abstract void calcBonus(double amount);
	
	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	//concrete method
	String[] showCourses() {
		return new String[] {"Java","Spring","Micro services"};
	}
	abstract void showProjects();
	final void showRules() {
		officeHours();
		System.out.println("Leave policies - not optional");
	}
	private void officeHours() {
		System.out.println("10 hours per day");
	}
}
