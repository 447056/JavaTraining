package com.max.Inheritance2;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void withDraw(double amount) {
		balance -= 500.0;
	}
	
	@Override
    void deposit(double amount){
    	balance += 500.0;
    }
}
