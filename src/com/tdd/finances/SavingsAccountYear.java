package com.tdd.finances;

public class SavingsAccountYear {

	private int balance;
	private int interestRate;

	public SavingsAccountYear(int startingBalance, int interestRate) {
		this.balance = startingBalance;
		this.interestRate = interestRate;
	}

	public SavingsAccountYear() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public int balance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	public SavingsAccountYear nextYear(int interestRate) {
		SavingsAccountYear result = new SavingsAccountYear();
		result.deposit(this.balance += this.balance * interestRate / 100);
		return result;
	}

	public int endingBalance() {
		return (this.balance += this.balance * interestRate / 100);
	}

}
