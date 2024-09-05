package com.max.Quest3;

public class Student {

	
	
	String department;
	String name;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Name " + name + " Department " + department);
	}

	String getGrades(int[] marks) {

		int sum = 0;
		int average = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		average = (sum / (marks.length ));
		System.out.println(average);
		if (average > 90 && average < 100) {
			return "A";
		} else if (average >= 80 && average <= 90) {
			return "B";
		} else if (average >= 70 && average <= 80) {
			return "C";
		} else if (average >= 60 && average <= 70) {
			return "D";
		} else if (average >= 50 && average <= 59) {
			return "E";
		} else {
			return "Fail";
		}
	}

}
