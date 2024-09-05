package com.max.Inheritance;


public class TeamOne extends Project {

	@Override
	void doTask() {
		System.out.println("Doing some project....");
	}
	
	void softwaresUsed(String...tools){
		for (String tool : tools) {
			System.out.println(tool);
		}
		
		}

	
}
