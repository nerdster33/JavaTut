package com.training.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class SampleClass {
	public static void main(String[] args) throws FileNotFoundException {
		
		/*System.out.println("Hello World!");
		InputStream input = new FileInputStream("hello.txt");
		System.out.println("File Opened!");
		System.err.println("File Opened!");*/
		
		
		/**
		 * To show how to get user input
		 */
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = scanner.next();
		//System.out.println("Your name is "+ name);
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		//System.out.println("Your age is "+ age);
		System.out.println("Your name is "+name + ", you are "+age + " years old");*/
		
		// to get 2 numbers from user and present the sum to the console
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Please input second number: ");
		int secondNumber = scanner.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("The sum of the two numbers is  "+ sum);
		scanner.close(); 
		
		
	}
}
