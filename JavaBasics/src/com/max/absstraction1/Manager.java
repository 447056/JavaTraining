package com.max.absstraction1;

public abstract class Manager extends Employee {
	
	private String activity;

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	abstract void calcBonus(double amount); 
	//{
		//System.out.println("Bonus "+(salary+amount));

	//}

	@Override
	void showProjects() {
		System.out.println("Working in cloud computing");

	}
	
	//own method
	void funClub() {
		System.err.println("Club activity"+ activity);
	}

}
