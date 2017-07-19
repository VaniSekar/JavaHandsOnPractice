package com.dovetailsystems.elevator;

public class Motor {

	public Motor() {
		// TODO Auto-generated constructor stub
	}

	public void runMotor(final int requestLevel) {
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				int count = startMotor(requestLevel);
				if (count == requestLevel) {
					stopMotor(count);
				} else {
					System.out.println("The elevator is at level" + count);
					return;
				}

			}
		});

		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public int startMotor(int requestLevel) {
		synchronized (this) {
			int count = 0;
			Elevator elevator = new Elevator();
			for (int i = 1; i <= requestLevel; i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count = elevator.moveElevator(requestLevel, System.currentTimeMillis());
			}
			System.out.println("the count of start Motor" + count);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
	}

	public void stopMotor(int requestLevel) {
		synchronized (this) {
			System.out.println("The elevator at Level" + requestLevel + "and it stopped");
			notifyAll();
		}

	}
}
