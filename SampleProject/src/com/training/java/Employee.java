	package com.training.java;
	
	public class Employee {
	//public static void main(String[] args) {
		//System.out.println("Hello World");
		
		// state of an employee
		
		String name;
		int age;
		
		// Constructor
		public Employee(String name, int age){
			this.age = age;
			this.name = name;
		}
		
		//Behaviour of employee
		
		public void work(){
			System.out.println(name + " is working");
		}
		
		public void greet(){
			System.out.println("Good morny, i am " + name);
		}
	}
