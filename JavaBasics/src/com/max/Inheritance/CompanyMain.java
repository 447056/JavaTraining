package com.max.Inheritance;

public class CompanyMain {
	
	public static void main(String[] args) {
		Project project = new TeamOne();
		project.doTask();
		
		TeamOne teamone = (TeamOne)project;
		teamone.softwaresUsed(new String[] {"eclipse","jenkins","Docker"});
		
		Project projectTwo = new TeamTwo();
		 
		projectTwo.doTask();
 
		TeamTwo teamTwo = (TeamTwo) projectTwo;
 
		String[] techStack = teamTwo.getTechStack();
		
		for (String tech : techStack) {
			System.out.println(tech);
		}
		
	}
	
}
