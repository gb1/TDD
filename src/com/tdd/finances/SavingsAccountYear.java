package com.tdd.finances;

public class SavingsAccountYear {

	private int startingBalance;
	private int interestRate;
	private int capitalGainsAmount;

	public SavingsAccountYear(int startingBalance, int interestRate) {
		this.startingBalance = startingBalance;
		this.interestRate = interestRate;
	}

	public SavingsAccountYear(int startingBalance, int capitalGainsAmount, int interestRate) {
		this.startingBalance = startingBalance;
		this.interestRate = interestRate;
		this.capitalGainsAmount = capitalGainsAmount;
	}
	
	public int startingBalance() {
		return startingBalance;
	}

	public int endingBalance() {
		return startingBalance + (startingBalance * this.interestRate / 100);
	}

	public int interestRate() {
		return this.interestRate;
	}

	public SavingsAccountYear nextYear() {
		return new SavingsAccountYear(this.endingBalance(), this.interestRate);
	}

	public void withdraw(int withdrawal) {
		startingBalance -= withdrawal;		
	}
	public int ten(){
		return 10;
	}

}
