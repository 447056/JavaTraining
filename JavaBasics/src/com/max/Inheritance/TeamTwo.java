package com.max.Inheritance;

public class TeamTwo extends Project {

	@Override
	void doTask() {
		System.out.println("Project implemented using Python");
	}
	
	String[] getTechStack(){
		String[] tech=new String[] {"Java","Spring","Angular"};
		return tech;
	}

}
