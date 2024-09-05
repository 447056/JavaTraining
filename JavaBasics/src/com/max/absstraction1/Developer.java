package com.max.absstraction1;

public class Developer extends TeamLead {

	public Developer(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId, activity);
	}
	
	@Override
	void showProjects() {
		
		System.out.println("Working in springboot");
	}
	
	//own method
	

}
