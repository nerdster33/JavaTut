package com.training.projects;
import java.util.Scanner;

public class AverageApp {

	public static void main(String[] args) {
		// strictly for integers
		int sum= 0;
		float Average;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of the total number you want "+
							"to determine the average: ");
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers: ");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			sum = sum + a[i];
		}
		System.out.println("The numbers are: ");
		for(int x : a){
			
			System.out.print(x + " ");
			
		}
		Average = (float)sum/n;
		System.out.println();
		System.out.println("Sum of numbers is : " +sum);
		System.out.println("Average is : "+Average);

	}

}
