package com.training.projects;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many friends: ");
		int numOfFrds = Integer.parseInt(scan.nextLine());
		
		//create a string array to store names of frds
		
		String arrayOfNames[] = new String[numOfFrds];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.println("Enter the name friend " + (i+1)+ ": ");
			arrayOfNames[i]= scan.nextLine();
		}
	
	
	
	for(int i = 0; i < arrayOfNames.length; i++){
		System.out.println("My friends "+(i + 1 ) + ":");
		System.out.println(arrayOfNames[i]+"\n");
	}
	}
}
