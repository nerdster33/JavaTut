package com.training.java;

import java.util.Scanner;

public class MonthlyApp {

	public static void main(String[] args) {
		// Days in a month
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select a month numbered from 1 to 12: ");
		int monthNum = input.nextInt();
		
		if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12) {
			System.out.println("The month contains 31 days");
		}
		else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11 ) {
			System.out.println("The month contains 30 days");
		} 
		else {
			System.out.println("The month contains 28 or 29 days");
		}
		
		input.close();

	}

}
