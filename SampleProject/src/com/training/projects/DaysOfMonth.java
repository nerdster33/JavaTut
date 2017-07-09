package com.training.projects;

import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number_Of_DaysInMonth = 0;
		String NameOfMonth = "Unknown";
		
		System.out.println("Input a month number: ");
		int month = input.nextInt();
		
		System.out.println("Input a year for the month: ");
		int year = input.nextInt();
		
		switch (month) {
		case 1:
			NameOfMonth = "January";
			number_Of_DaysInMonth = 31;
			break;
		case 2:
			NameOfMonth = "Feburary";
			if ((year % 400)== 0 || ((year % 4)== 0 && (year % 100 != 0 )) ){
				number_Of_DaysInMonth = 29;
			}
			else {
				number_Of_DaysInMonth = 28;
			}
			break;
		case 3:
			NameOfMonth = "March";
			number_Of_DaysInMonth = 31;
			break;
		case 4:
			NameOfMonth = "April";
			number_Of_DaysInMonth = 31;
			break;
		case 5:
			NameOfMonth = "May";
			number_Of_DaysInMonth = 31;
			break;
		case 6:
			NameOfMonth = "June";
			number_Of_DaysInMonth = 30;
			break;
		case 7:
			NameOfMonth = "July";
			number_Of_DaysInMonth = 31;
			break;
		case 8:
			NameOfMonth = "August";
			number_Of_DaysInMonth = 31;
			break;
		case 9:
			NameOfMonth = "September";
			number_Of_DaysInMonth = 31;
			break;
		case 10:
			NameOfMonth = "October";
			number_Of_DaysInMonth = 31;
			break;
		case 11:
			NameOfMonth = "November";
			number_Of_DaysInMonth = 30;
			break;
		case 12:
			NameOfMonth = "December";
			number_Of_DaysInMonth = 31;
			break;

		
		}
		
		System.out.println(NameOfMonth + " " + year + " has " + number_Of_DaysInMonth + " days");
		
		

	}

}
