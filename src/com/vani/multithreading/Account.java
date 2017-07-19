package com.dovetailsystems.multithreading;

import com.dovetailsystems.exceptionhandling.TransferException;

public class Account {

	private int bal = 10000;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(int amount) {
		bal += amount;
	}

	public void withdraw(int amount) throws TransferException {
//		if (bal < amount) {
//			throw new TransferException();
//		}
		bal -= amount;
	}

	public int getBalance() {
		return bal;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		try {
			acc1.withdraw(amount);
		} catch (TransferException e) {
			return;
		}
		acc2.deposit(amount);
	}

}
