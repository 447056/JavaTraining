package com.max.quest2;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}


	void withdraw(double amount) {
		 this.balance = balance-amount;
	}
	
	void deposit(double amount) {
		this.balance = balance + amount;
		
	}
	
	double getbalance() {
		return balance;
	}
}
