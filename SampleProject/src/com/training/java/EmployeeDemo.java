package com.training.java;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Niffy = new Employee("Niffy", 30);
		
		Employee Nerd = new Employee("Nerd", 30);
		
		Niffy.greet();
		Niffy.work();

		Nerd.greet();
		Nerd.work();
	}

}
