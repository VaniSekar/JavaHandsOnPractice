package com.vani.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor1 implements Runnable {

	private int id;

	public Processor1(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("starting" + id);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Completed" + id);

	}

}

public class LearningThreads5 {

	public LearningThreads5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<5;i++){
			executor.submit(new Processor1(i));
		}
		
		executor.shutdown();
		
		System.out.println("All tasks submitted");
		try {
			//Hello hello = new Hello();
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All tasks Completed");
		
		

	

}
}
