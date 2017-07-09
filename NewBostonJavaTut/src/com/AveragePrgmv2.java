package com;

import java.util.Scanner;

/**
 * Created by Nerd on 6/25/2017.
 */
public class AveragePrgmv2 {
    public static void main(String[] args) {
        double Average, sum = 0;
        System.out.println("How many numbers do you want to input: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i <a.length ; i++) {
            a[i] = input.nextInt();
            sum = sum + a[i];

        }
        System.out.println("The numbers are: ");
        for(int x: a){
            System.out.print(x + " ");
        }
Average = (float)sum/n;
        System.out.println();
        System.out.println("The Sum of the numbers is "+sum);
        System.out.println("The Average of the numbers is "+Average);

    }
}
