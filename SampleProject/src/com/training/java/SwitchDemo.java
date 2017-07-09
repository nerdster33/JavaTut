package com.training.java;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please select a month number");
		int monthNum = input.nextInt();
		
		/*
		 *  various form of if statement
		 */
		
		
		/*//if (monthNum == 1 || monthNum == 2 || monthNum== 3 ) {
		if (monthNum >= 1 && monthNum <= 3 ) {
			System.out.println("You are in the first quater of the year");
		}
		//else if (monthNum == 4 || monthNum == 5 || monthNum== 6 ) {
		else if (monthNum >= 4  && monthNum <= 6 ) {
			System.out.println("You are in the second quater of the year");
		}
		
		//else if (monthNum == 7 || monthNum == 8 || monthNum== 9 ) {
		else if (monthNum >= 4  && monthNum <= 6 ) {
			System.out.println("You are in the third quater of the year");
		}
		else if (monthNum == 10 || monthNum == 11 || monthNum== 12 ) {
			System.out.println("You are in the fourth quater of the year");
		}
		else {
			System.out.println("Invalid selection");
		}
		*/
		
		// using switch for same prgm
		switch (monthNum) {
//		case 1:
//			System.out.println("You are in the first quater of the year");
//			break;
//		case 2:
//			System.out.println("You are in the first quater of the year");
//			break;
//		case 3:
//			System.out.println("You are in the first quater of the year");
//			break;
// up to case 12
		case 1:
		case 2:	
		case 3:
			System.out.println("You are in the first quater of the year");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("You are in the second quater of the year");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("You are in the third quater of the year");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("You are in the fourth quater of the year");
			break;

		default:
			System.out.println("Invalid month");
			break;
		}

	}

}
