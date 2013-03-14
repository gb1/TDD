package com.tdd.finances;

public class SavingsAccount {

	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
	}

	public int balance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

}
