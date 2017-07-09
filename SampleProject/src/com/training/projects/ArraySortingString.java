package com.training.projects;
import java.util.Scanner;
import java.util.Arrays;


public class ArraySortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many names do you want to enter: ");
		
		int num = Integer.parseInt(input.nextLine());
		String a[]= new String[num];
		System.out.println("Enter the names");
		
		for (int i = 0; i < a.length; i++) {
			a[i]= input.nextLine();
			
		}
		System.out.println("These are the names entered before sorting:");
		for(String y: a){
			System.out.print(y+ " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("These are the names after sorting :");
		for(String z: a){
			System.out.print(z+ " ");
		}

	}

}
