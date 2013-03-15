package com.tdd.finances;
import static org.junit.Assert.*;

import org.junit.Test;


public class _SavingsAccountYear {
	
	@Test
	public void startingBalanceMatchesContructor(){
		SavingsAccountYear account = newAccount();
		assertEquals(10000, account.startingBalance());
	}

	private SavingsAccountYear newAccount() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		return account;
	}

	@Test
	public void endingBalanceAppliesInterestRate(){
		SavingsAccountYear account = newAccount();
		assertEquals(11000, account.endingBalance());
	}
	
	@Test
	public void interestRate(){
		//SavingsAccountYear 
	}
	
	@Test
	public void nextYear() {
		SavingsAccountYear thisYear = newAccount();
		assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());
	}
	
	@Test
	public void nextYearsInterestRateEqualsThisYearsInterestRate(){
		SavingsAccountYear thisYear = newAccount();
		assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
		
	}	
	
	@Test
	public void withdrawingFundsOccursAtTheBeginningOfTheYear(){
		SavingsAccountYear year = new SavingsAccountYear(10000, 10);
		year.withdraw(1000);
		assertEquals(year.endingBalance(), 9900);
	}
	
	@Test
	public void withDrawingMoreThanPrincipalIncursCapitalGainsTax(){
		SavingsAccountYear year = new SavingsAccountYear(10000, 7000, 10);
		year.withdraw(3000);
		assertEquals(7700, year.endingBalance());
		year.withdraw(5000);
		assertEquals(2000 + 200 - (1250), year.endingBalance());
		
	}
	
}