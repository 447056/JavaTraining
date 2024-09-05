package com.max.overloading;

public class OverLoadMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Vinay", "Programmer");
		Employee emp2 = new Employee("Vijay", "Manager");
		Employee emp3 = new Employee("Vinayak", "Director");

		Employee[] employees = new Employee[3];
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;

		for (Employee employee : employees) {
			switch (employee.designation.toUpperCase()) {
			case "PROGRAMMER":
				employee.calcBonus(10000);
				break;

			case "MANAGER":
				employee.calcBonus(10000, 25000);
				break;

			case "DIRECTOR":
				employee.calcBonus(10000, 25000, 23000);
				break;
			}
		}
	}
}
