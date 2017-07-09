package com.training.java;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number: ");
		int x = scanner.nextInt();
		
		if (x == 5) {
			System.out.println("You are right!");
		} else {
			System.out.println("sorry, try again!");
		}

	}

}
