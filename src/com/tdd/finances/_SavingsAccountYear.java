package com.tdd.finances;
import static org.junit.Assert.*;

import org.junit.Test;


public class _SavingsAccountYear {

	@Test
	public void balanceAndWithdrawalTest() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(100);
		assertEquals("after deposit", 100, account.balance());
		account.withdraw(50);
		assertEquals("after withdraw", 50, account.balance());
		account.deposit(100);
		assertEquals("another", 150, account.balance());
		account.deposit(100);
		assertEquals("another", 250, account.balance());
	}
	
	@Test
	public void negativeBalance(){
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(-75);
		assertEquals("overdrawn", -75, account.balance());
	}
	
	@Test
	public void nextYear(){
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(10000);
		SavingsAccountYear nextYear = account.nextYear(10);
		assertEquals(11000, nextYear.balance());
	}
	
	@Test
	public void endingBalance(){
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		assertEquals(11000, account.endingBalance());
	}

}
