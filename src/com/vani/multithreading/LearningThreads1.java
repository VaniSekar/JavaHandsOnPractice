package com.vani.multithreading;

import java.util.Scanner;

class Processor extends Thread{
	private volatile boolean running = true;
	
	public void run(){
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutdown(){
		running = false;
	}
}




public class LearningThreads1 {

	public LearningThreads1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("please return to stop");
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		p1.shutdown();
		
		
		

	}

}
