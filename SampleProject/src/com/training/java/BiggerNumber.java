package com.training.java;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the first number: ");
		float fNum = input.nextFloat();
		
		System.out.println("Please type in the second number: ");
		float sNum = input.nextFloat();
		
		if (fNum > sNum) {
			System.out.println(fNum +" is greater than " + sNum);
		} else {
			System.out.println(sNum +" is greater than " + fNum);
		}
		
		input.close();

	}

}
