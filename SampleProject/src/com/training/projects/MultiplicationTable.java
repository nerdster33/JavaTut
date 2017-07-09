package com.training.projects;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the number for the multiplication table you want:  ");
		int numb = input.nextInt();
		System.out.println("Enter a number where you want the multiplication table to stop: ");
		int stopNumb = input.nextInt();
		
		for (int i = 1; i <= stopNumb; i++) {
			int ans = numb*i;
			System.out.println(numb +" * "+ i +" = "+ ans );
			
		}
		
		

	}

}
