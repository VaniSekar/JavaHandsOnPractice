package com.dovetailsystems.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	
	//Account account = new Account();
	private Account acc1 = new Account();
	private Account acc2 = new Account();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	//private Integer amount;

	public Runner() {
		// TODO Auto-generated constructor stub
	}
	
	public void firstThread() throws InterruptedException{
		Random random = new Random();
		
		for(int i=0;i<1000;i++){
			lock1.lock();
			lock2.lock();
			Account.transfer(acc1, acc2, random.nextInt(100));
			lock1.unlock();
			lock2.unlock();
		}
		
		
	}
	
	public void secondThread() throws InterruptedException{
		//account.transfer(acc1, acc2, amount);
		Random random = new Random();
		for(int i=0;i<1000;i++){
			lock1.lock();
			lock2.lock();
			
			Account.transfer(acc1, acc2, random.nextInt(100));
			lock1.unlock();
			lock2.unlock();
			
		}
		
	}
	public void finished(){
		System.out.println("Balance in Account1...>"+acc1.getBalance());
		System.out.println("Balance in Account2...>"+acc2.getBalance());
		System.out.println("Total Balance"+(acc1.getBalance()+acc2.getBalance()));
	}

}
