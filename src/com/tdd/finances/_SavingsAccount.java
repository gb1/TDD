package com.tdd.finances;
import static org.junit.Assert.*;

import org.junit.Test;


public class _SavingsAccount {

	@Test
	public void balanceAndWithdrawalTest() {
		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		assertEquals("after deposit", 100, account.balance());
		account.withdraw(50);
		assertEquals("after withdraw", 50, account.balance());
		account.deposit(100);
		assertEquals("another", 150, account.balance());
	}
	
	@Test
	public void negativeBalance(){
		SavingsAccount account = new SavingsAccount();
		account.deposit(-75);
		assertEquals("overdrawn", -75, account.balance());
	}

}
