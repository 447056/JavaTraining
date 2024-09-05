package com.max.quest2;

public class BankMain {
	
public static void main(String[] args) {

	Bank bank = new Bank(10000);
	bank.withdraw(500);
	System.out.println(bank.getbalance());
	
	bank.deposit(1000);
	System.out.println(bank.getbalance());
	
	
	
}

}
