package com.max.Quest3;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student("Vinay", "PCM");
		student.printDetails();
		int[] marks = {80,70,80,90};
	String result=	student.getGrades(marks);
	System.out.println(result);
	}

}
