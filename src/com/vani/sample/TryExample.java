package com.dovetailsystems.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TryExample {

	public TryExample() {
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setAge(42);
		emp1.setName("Neha");

		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setAge(2);
		emp2.setName("Vani");
		Employee emp3 = new Employee();
		emp3.setId(4);
		emp3.setAge(8);
		emp3.setName("Sid");
		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		TryExample tryExample = new TryExample();
		//tryExample.sortEmployeeByName(employees);
		
		// tryExample.sortEmployeeById(employees);
		// tryExample.sortEmployeeByAge(employees);
		
		/*for (Employee employee : employees) {
			System.out.println("the sorted Employee  Name List" + employee.getName());
		}*/
		SortedSet<Employee> employeeSet = new TreeSet<>();
		employeeSet.addAll(employees);
		for (Employee employee : employeeSet) {
			System.out.println("the sorted Employee  Name Set" + employee.getName());
		}
		

	}

	public List<Employee> sortEmployeeById(List<Employee> employees) {
		Collections.sort(employees);
		return employees;
	}

	public List<Employee> sortEmployeeByAge(List<Employee> employees) {
		AgeComparator c = new AgeComparator();
		Collections.sort(employees, c);
		//Collections.ma
		return employees;
	}

	public List<Employee> sortEmployeeByName(List<Employee> employees) {
		// NameComparator nameComparator = new NameComparator();
		
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		return employees;
	}

}

class AgeComparator implements Comparator<Employee> {

	public AgeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() == o2.getAge()) {
			return 0;
		} else
			return -1;
	}

}

 class NameComparator implements Comparator<Employee>{
 
  @Override public int compare(Employee o1, Employee o2) { return
  o1.getName().compareToIgnoreCase(o2.getName()); }
  
  }
 
