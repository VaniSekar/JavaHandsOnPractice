package com.vani.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LearningThreads3 {

	public LearningThreads3() {
		// TODO Auto-generated constructor stub
	} 

	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	List<Integer> l1 = new ArrayList<Integer>();
	List<Integer> l2 = new ArrayList<Integer>();

	public  void stageOne() {
		synchronized (lock1){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l1.add(random.nextInt(100));
	}
	}

	public  void stageTwo() {
		synchronized(lock2){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l2.add(random.nextInt(100));
	}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void process2() {

		System.out.println("Starting");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				process();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				process();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("the time taken" + (end - start));
		System.out.println("ending" + l1.size() + "l2..." + l2.size());

	}

	public static void main(String[] args) {
		LearningThreads3 lt3 = new LearningThreads3();
		lt3.process2();
	}

}
