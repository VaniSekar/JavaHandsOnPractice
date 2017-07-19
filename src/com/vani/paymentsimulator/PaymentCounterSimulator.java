package com.vani.paymentsimulator;

import java.util.Random;

public class PaymentCounterSimulator {

	public PaymentCounterSimulator() {
		// TODO Auto-generated constructor stub
	}

	// static long Timestamp = System.currentTimeMillis();
	public static void main(String[] args) {
		PaymentCounterSimulator paymentCounterSimulator = new PaymentCounterSimulator();
		PaymentCounter payCount = new PaymentCounter();

		Thread t1 = new Thread(new Runnable() {
			public void run() {

				paymentCounterSimulator.makeRandomCall();
			}

		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				paymentCounterSimulator.makeRandomCall();
			}

		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				paymentCounterSimulator.makeRandomCall();
			}

		});
		Thread t4 = new Thread(new Runnable() {
			public void run() {
				paymentCounterSimulator.makeRandomCall();
			}

		});
		Thread t5 = new Thread(new Runnable() {
			public void run() {
				paymentCounterSimulator.makeRandomCall();
			}

		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(
				"The number of processed payments" + payCount.paymentsProcessedCounter(System.currentTimeMillis()));

	}

	public void makeRandomCall() {
		long startTime = System.currentTimeMillis();
		PaymentCounter paymentCounter = new PaymentCounter();

		while ((System.currentTimeMillis() - startTime) < (.005 * 60 * 1000)) {

			Random random = new Random();
			int count = random.nextInt(10);
			try {
				Thread.sleep(count+10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			paymentCounter.incrementCounter(System.currentTimeMillis());

		}

	}

}
