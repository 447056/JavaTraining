package com.max.Inheritance2;

public class Savings extends Account {
	
	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void withDraw(double amount) {
		balance -= 250.0;
	}
	
	@Override
    void deposit(double amount){
    	balance += 250.0;
    }

}
