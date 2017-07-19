package com.dovetailsystems.sample;

public class Animal {

	public Animal() {
		// TODO Auto-generated constructor stub
		
	}
	
	private String color;
	private String shape;
	public int noOfLegs;
	
	
	public void breathe(){
		
	}
	
	public void walk(){
		
		
	}
	
	public void bark(){
		System.out.println("the Animal barks");
		
	}
	public void eat(){
		System.out.println("the animal eats");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}
