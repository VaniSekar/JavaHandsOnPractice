package com.dovetailsystems.sample;

public class AnimalClient {

	public AnimalClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Animal animal = new Dog();
		animal.bark();

		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		// animal.sleep();
		dog.bark();
		Thalaivar t;
		System.out.println("before instantiation");
		t = Thalaivar.getInstance();
		System.out.println(t.getHi());
	Thalaivar t1= Thalaivar.getInstance();
	}

}
