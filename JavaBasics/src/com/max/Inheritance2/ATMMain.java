package com.max.Inheritance2;

public class ATMMain {

	public static void main(String[] args) {
		
		Account account = new Savings(10000);
		account.withDraw(500.0);
		account.deposit(6000.0);
		double remainingAmount = account.getBalance();
		System.out.println(remainingAmount);
		
		Account account1 = new Current(25000);
		account1.deposit(700.0);
		account1.withDraw(8000.0);
		double remainingAmount1 = account1.getBalance();
		System.out.println(remainingAmount1);
	}
}
