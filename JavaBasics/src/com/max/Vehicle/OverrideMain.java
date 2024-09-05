package com.max.Vehicle;

public class OverrideMain {
	
	public static void main(String[] args) {
		// super class ref = sub class obj
		
		
		
		Vehicle vehicle = new Bike();
		vehicle.getMilage();  //print bike milage
		
		Bike bike = (Bike)vehicle;
		bike.showacc();
		
		vehicle = new Car();
		vehicle.getMilage();  //print car milage
		
		
		
	}

}
