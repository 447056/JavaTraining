package com.max.Inheritance2;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	void withDraw(double amount) {
		balance -= amount;
		System.out.println(balance);
	}
	
    void deposit(double amount){
    	balance += amount;
    	System.out.println(balance);
    }
    
    double getBalance(){
    	return balance;
    }
}
