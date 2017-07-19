package com.vani.paymentsimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCounter {

	public PaymentCounter() {
		// TODO Auto-generated constructor stub
	}

	
//	private static List<Long> transactionList = new ArrayList<Long>();	
	private static List<Long> transactionList = Collections.synchronizedList(new ArrayList<>());

//	Object lock1 = new Object();
//	Object lock2 = new Object();

	public void incrementCounter(Long timestamp) {
//		synchronized (transactionList) {
			transactionList.add(timestamp);
			
			System.out.println("timestamp :"  + timestamp + " list size--->"+transactionList.size());
//		}

	}

	public int paymentsProcessedCounter(long timestamp) {
		int noOfProcessedPayments = 0;
		synchronized (transactionList) {
			
			long hourBefore = timestamp - (60 * 60 * 1000);
			System.out.println("*************************");
			System.out.println("list size :" + transactionList.size());
			for (int i = 0; i < transactionList.size(); i++) {
				//if (transactionList.get(i) == null) {
					//System.out.println("index :" + i + " value :" + transactionList.get(i));
					//continue;
				//}
				if (((transactionList.get(i) >= hourBefore) && (transactionList.get(i) <= timestamp))) {
					noOfProcessedPayments++;
				}
			}

		}

		return noOfProcessedPayments;
	}

}
