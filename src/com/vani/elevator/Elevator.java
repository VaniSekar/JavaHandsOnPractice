package com.dovetailsystems.elevator;

public class Elevator {

	public Elevator() {
		// TODO Auto-generated constructor stub
	}

	private static volatile int  count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Elevator.count = count;
	}

	
	public int moveElevator(int requestLevel, long startingTime) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		System.out.println("the incremented count while moving" + count);
		return count;
	}
}
