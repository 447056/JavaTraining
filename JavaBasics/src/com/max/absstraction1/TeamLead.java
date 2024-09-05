package com.max.absstraction1;

public abstract class TeamLead extends Manager {

	@Override
	void calcBonus(double amount) {
		System.out.println();
	}

	public TeamLead(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId, activity);
	}

}
