package com.training.projects;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want sort: ");
		
		int num = input.nextInt();
		int a[]= new int[num];
		System.out.println("Enter the number");
		
		for (int i = 0; i < a.length; i++) {
			a[i]= input.nextInt();
			
		}
		System.out.println("These are the numbers entered before sorting:");
		for(int y: a){
			System.out.print(y+ " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("These are the numbers after sorting :");
		for(int z: a){
			System.out.print(z+ " ");
		}
		

	}

}
