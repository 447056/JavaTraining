package com.max.quest4;

public class Trainer {
	 
	
 
	public String[] showCourses() {
 
		return new String[] {"Java", ".net", "Python"};
	}
 
	public void showTrainers(String... names) {
		for (String name : names) {
 
			System.out.println("Names =" + name);
		}
	}
}