package com.oops.basic;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name="Test Emp";
		employee.salary=10000;
		System.out.println(employee.name +"  "+employee.salary);
		employee.getDetails();
		String result = employee.greet("Great Day");
		System.out.println(result);
		
		Employee employee2 = employee;
		
}
}
