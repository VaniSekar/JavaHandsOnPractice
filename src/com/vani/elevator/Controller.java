package com.dovetailsystems.elevator;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	Motor motor = new Motor();
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public void processRequest(final int request) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Controller controller = new Controller();
				controller.addRequest(request);
				System.out.println("queue size" + queue.size());
				controller.takeRequest();
				// System.out.println();
			}

		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Controller controller = new Controller();
				System.out.println("queue size" + queue.size());
				controller.takeRequest();
			}

		});

		t1.start();

		// t2.start();
		try {
			t1.join();
			// t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void addRequest(int request1) {
		synchronized (this) {
			try {
				queue.put(request1);
				System.out.println("the value added in queue" + queue.size());
				// wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int checkState() {
		System.out.println("The state of the elevator is at" + Elevator.getCount());
		return Elevator.getCount();
	}

	public void takeRequest() {
		int value = 0;
		synchronized (this) {
			System.out.println("the value in queue before taking" + queue.size());
			while (true) {
				if (!queue.isEmpty()) {
					try {
						Thread.sleep(1000);
						value = queue.take();
						System.out.println("The value taken from queue request" + value);
						// notify();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					motor.runMotor(value);
				}
			}
		}
	}

}
