/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasicmaths;
import java.util.Scanner;

public class CubeOfNumber {

    
    public static void main(String[] args) {
        double num1, num2, higher,cube;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        
        higher = Math.max(num1,num2);
        cube = Math.pow(higher,3);
        
        System.out.printf("The higher value between %f and %f is %f \n", num1, num2,higher );
        
        System.out.printf("The cube of %f is %f \n", higher, cube );
        
    }

}
