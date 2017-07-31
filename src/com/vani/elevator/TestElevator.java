package com.vani.elevator;

public class TestElevator {

	public TestElevator() {
		// TODO Auto-generated constructor stub
	}
private static  int request = 5;
	public static void main(String[] args) {
	
		Controller controller = new Controller();
		controller.processRequest(request);
		controller.checkState();
	}

}
