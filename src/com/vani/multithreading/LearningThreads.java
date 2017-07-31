package com.vani.multithreading;


	
	class Runner implements Runnable{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println("Hello threads"+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
			
		}
		
	}

	public class LearningThreads {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		t1.start();
		t2.start();
	}
}
