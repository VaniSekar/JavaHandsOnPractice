package com.dovetailsystems.sample;

public class Employee implements Comparable<Employee> {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private int age;
	private String name;
	private String address;
	private double salary;
	private String designation;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getAddress()	{
		return address;
		
	}
	
	public void setAddress(String address){
		this.address = address;
	}
    public double getSalary(){
    	return salary;
    }
    public void setSalary(double salary){
    	this.salary = salary;
    }
    public String getDesignation(){
    	return designation;
    }
    
    public void setDesignation(String designation){
    	this.designation = designation;
    }
	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id){
			return 1;
		}else if(this.id == o.id){
			return 0;
		}else
		return -1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
