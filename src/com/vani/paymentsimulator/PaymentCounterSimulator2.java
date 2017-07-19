package com.vani.paymentsimulator;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

	static boolean bRun = true;

	public void run() {

		try {
			while (bRun) {
				Random random = new Random();
				int count = random.nextInt(100);
				Thread.sleep(10 * count);
				System.out.println("the current thread" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// PaymentCounter paymentCounter = new PaymentCounter();

	}
}

public class PaymentCounterSimulator2 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		executor.submit(new Processor());
		// }
		
		long startTime = System.currentTimeMillis();
		for (;;) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if ((System.currentTimeMillis() - startTime) < (.25 * 60 * 1000)) {
				Processor.bRun = false;
				break;
			}
		}
		executor.shutdown();
		System.out.println("All threads Submitted");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
